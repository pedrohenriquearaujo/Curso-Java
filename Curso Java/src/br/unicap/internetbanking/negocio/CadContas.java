package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioContasArray;

public class CadContas {
	
	private RepositorioContasArray r;
	
	public CadContas(RepositorioContasArray r) {
		this.r = r;
	}
	

	public void inserir(ContaAbstrata c){
		
		if(!r.existe(c.getNumero())){		
			r.inserir(c);
		}else{
			System.out.println("Conta já Existe");
		}
	}	
	public void atualizar (ContaAbstrata c){
			if(r.procurar(c.getNumero()) != null) {
				r.atualizar(c);
			}else {
				System.out.println("Conta Não Existe");
			}
			
			
	}	
	public void remover (String numeroConta){
			r.remover(numeroConta);	
	}
	public ContaAbstrata procurar(String numeroConta){
		return r.procurar(numeroConta);		
	}


	public void creditar(String n, double v) {
		ContaAbstrata c = r.procurar(n);
		if(c != null) {
		
		c.creditar(v);
		//r.atualizar(c);
		}else {
			System.out.println("Conta Inexistente");			
		}
	}
	
	public void debitar(String n, double v) {
		ContaAbstrata c = r.procurar(n);
		c.debitar(v);
		r.atualizar(c);		
	}


	public void transferir(String origem, String destino, double val) {
		ContaAbstrata o = r.procurar(origem);
		ContaAbstrata d = r.procurar(destino);
		
		o.transferir(d, val);
		r.atualizar(o);
		r.atualizar(d);
	}
	
}
