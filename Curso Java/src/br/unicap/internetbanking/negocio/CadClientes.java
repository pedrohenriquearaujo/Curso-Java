package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioClientesArray;
import br.unicap.internetbanking.excecoes.ClienteInexistenteException;


public class CadClientes {
	
	private RepositorioClientesArray r;

	public CadClientes(RepositorioClientesArray r) {
		this.r = r;
	}
	
	public void inserir(Cliente c) {
		if(!r.existe(c.getCPF())){		
			r.inserir(c);
		}else{
			System.out.println("Cliente já Existe");
		}
	}
	public void remover(String CPF) {
		r.remover(CPF);
	}
	public Cliente procurar(String CPF) throws ClienteInexistenteException {
		return r.procurar(CPF);		
	}
	public void atualizar(Cliente c) {
		r.atualizar(c);
	} 


}
