package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioClientesArray;
import br.unicap.internetbanking.excecoes.ClienteExistenteException;
import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;


public class CadClientes {
	
	private RepositorioClientesArray r;

	public CadClientes(RepositorioClientesArray r) {
		this.r = r;
	}
	
	public void inserir(Cliente c) throws ClienteExistenteException{
		if(!r.existe(c.getCPF())){		
			r.inserir(c);
		}else{
			throw new ClienteExistenteException(c.getNome());
		}
	}
	public void remover(String CPF) throws ClienteInexistenteException {
		r.remover(CPF);
	}
	public Cliente procurar(String CPF) throws ClienteInexistenteException {
		return r.procurar(CPF);		
	}
	public void atualizar(Cliente c) throws ClienteInexistenteException {
		r.atualizar(c);
	} 


}
