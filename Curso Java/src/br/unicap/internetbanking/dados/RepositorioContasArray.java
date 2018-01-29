package br.unicap.internetbanking.dados;

import br.unicap.internetbanking.excecoes.ContaExistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.interfaces.IRepositorioContas;
import br.unicap.internetbanking.negocio.ContaAbstrata;

public class RepositorioContasArray implements IRepositorioContas {
	
	private static final int TAM_CACHE_CONTAS = 100;
	private ContaAbstrata contas[];
	private static int indice;
	
	public static int getIndice() {
		return indice;
	}
	
	public RepositorioContasArray(){
		indice = 0;
		contas = new ContaAbstrata [TAM_CACHE_CONTAS];		
	}
	
	public void inserir(ContaAbstrata c){		
		contas[indice] = c;
		indice++;		
	}
	
	public void atualizar (ContaAbstrata c){		
		int i = procurarIndice(c.getNumero());
		
		if(i != -1){			
			contas[i]= c;
		}
	}
	
	public void remover (String numeroConta) throws ContaInexistenteException{
		
		if(existe(numeroConta)){
			int i = procurarIndice(numeroConta);
			contas[i] = contas[indice - 1];
			contas[indice - 1] = null;
			indice = indice - 1;			
		}else {
			throw new ContaInexistenteException(numeroConta);
		}		
	}
	
	private int procurarIndice(String numeroConta){
		
		int ind =-1;
		
		for(int i=0; i < RepositorioContasArray.getIndice();i++){			
			if(contas[i].getNumero().equals(numeroConta)){
				ind=i;
				break;				
			}				
		}
		return ind;		
	}
	
	public boolean existe (String numeroConta){		
		boolean resp = false;
		
		int i = procurarIndice(numeroConta);
		
		if( i != -1){
			resp = true;
		}		
		return resp;		
	}
	
	public ContaAbstrata procurar(String numeroConta) throws ContaInexistenteException{		
		
		ContaAbstrata c = null;
		
		if(existe(numeroConta)){
			int i = procurarIndice(numeroConta);
			 c = contas[i];
		}else {
			throw new ContaInexistenteException (numeroConta);
		}
		return c;		
	}
	
}
