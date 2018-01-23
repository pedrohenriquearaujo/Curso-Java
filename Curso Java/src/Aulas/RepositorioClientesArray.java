package Aulas;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientesArray {
	
	private List<Cliente> clientes;
	
	
	public RepositorioClientesArray() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void inserir(Cliente c) {
		clientes.add(c);
	}
	
	public void atualizar(Cliente c) {
		
		int i = procurarIndice(c.getCPF());
		
		if(i != -1) {
			clientes.add(i,c);
		}else {
			System.out.println("Conta não existe");
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
	
	public void remover (String CPF) {
			
		if(existe(CPF)) {
			int i = procurarIndice(CPF);			
			clientes.remove(clientes.get(i));
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
	
	public Cliente procurar(String CPF) {
		
		Cliente c = null;
		
		int i = procurarIndice(CPF);
		
		if(i != -1) {
			c = clientes.get(i);			
		}else {
			System.out.println("Conta não encontrada");
		}
		
		return c;
	}
	
}
