package br.unicap.internetbanking.dados;

import java.util.Iterator;
import java.util.TreeSet;

import br.unicap.internetbanking.excecoes.ClienteExistenteException;
import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.interfaces.IRepositorioClientes;
import br.unicap.internetbanking.negocio.Cliente;

public class RepositorioClienteSet implements IRepositorioClientes {
	
	private TreeSet<Cliente> clientes;
	
	public RepositorioClienteSet() {
		this.clientes = new TreeSet<Cliente>();
	}
	

	
	public void atualizar(Cliente c) throws ClienteInexistenteException {
		Cliente cliente = procurar(c.getCPF());	
			clientes.remove(cliente);
			clientes.add(c);
	}

	
	public boolean existe(String CPF) {
		boolean resp = false;
		
		Cliente c = null;
		Iterator<Cliente> it = clientes.iterator();
		
		while(it.hasNext()) {
			c = it.next();
			if(c.getCPF().equals(CPF)) {
				resp = true;
				break;
			}
		}
		return resp;		
	}

	
	public void inserir(Cliente c) throws ClienteExistenteException {
		if(existe(c.getCPF())) {
			throw new ClienteExistenteException(c.getCPF());
		}else {
			clientes.add(c);
		}
	}

	
	public Cliente procurar(String CPF) throws ClienteInexistenteException {
		Cliente c = null;
		Iterator<Cliente> it = clientes.iterator();
		
		while(it.hasNext()) {
			c = it.next();
			if(c.getCPF().equals(CPF)) {				
				break;
			}
		}		
		if(c == null) {
			throw new ClienteInexistenteException(CPF);
		}		
		return c;	
	}


	public void remover(String CPF) throws ClienteInexistenteException {
		Cliente c = procurar(CPF);
		clientes.remove(c);
	}

}
