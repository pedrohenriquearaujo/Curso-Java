package br.unicap.internetbanking.dados;


import java.util.ArrayList;
import java.util.List;

import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.interfaces.IRepositorioClientes;
import br.unicap.internetbanking.negocio.Cliente;

public class RepositorioClientesArray implements IRepositorioClientes {
	
	private List<Cliente> clientes;
	
	public RepositorioClientesArray() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void inserir(Cliente c) {
		clientes.add(c);
	}
	public void atualizar(Cliente c) throws ClienteInexistenteException {
		
		int i = procurarIndice(c.getCPF());
		
		if(i != -1) {
			clientes.add(i,c);
		}else {
			throw new ClienteInexistenteException (c.getNome());
		}
	}
	private int procurarIndice(String CPF) {
		
		int ind = -1;
		
		for(Cliente c : clientes ) {
			if(c.getCPF().equals(CPF)) {
				ind = clientes.indexOf(c);
				break;
			}			
		}
		return ind;		
	}
	public void remover (String CPF) throws ClienteInexistenteException {
			
		if(existe(CPF)) {
			int i = procurarIndice(CPF);			
			clientes.remove(clientes.get(i));
		}else {
			throw new ClienteInexistenteException(CPF);
		}
		
	}
	public boolean existe (String CPF){	
		
		boolean resp = false;
		
		int i = procurarIndice(CPF);
		
		if( i != -1){
			resp = true;
		}		
		return resp;		
	}
	public Cliente procurar(String CPF) throws ClienteInexistenteException {
		
		Cliente c = null;
		
		int i = procurarIndice(CPF);
		
		if(i != -1) {
			c = clientes.get(i);			
		}else {
			throw new ClienteInexistenteException(CPF);
		}
		
		return c;
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		
	}
	
}

