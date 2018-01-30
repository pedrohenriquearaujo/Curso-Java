package br.unicap.internetbanking.dados;

import java.util.HashMap;
import java.util.Map;

import br.unicap.internetbanking.excecoes.ContaExistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.interfaces.IRepositorioContas;
import br.unicap.internetbanking.negocio.ContaAbstrata;

public class RepositorioContaMap implements IRepositorioContas {
	
	private Map<String,ContaAbstrata> contas;
	
	public RepositorioContaMap () {
		this.contas = new HashMap<String,ContaAbstrata>();		
	}

	
	public void inserir(ContaAbstrata c) throws ContaExistenteException {
		if(existe(c.getNumero())) {
			throw new ContaExistenteException(c.getNumero());
		}else {
			contas.put(c.getNumero(), c);
		}
	}

	
	public boolean existe(String numeroConta) {		
		return contas.containsKey(numeroConta);
	}

	public void atualizar(ContaAbstrata c) throws ContaInexistenteException {		
			remover(c.getNumero());
			contas.put(c.getNumero(), c);
	}

	public ContaAbstrata procurar(String numeroConta) throws ContaInexistenteException {
		ContaAbstrata c = contas.get(numeroConta);
		
		if( c == null) {
			throw new ContaInexistenteException(numeroConta);
		}		
		return c;
	}

	public void remover(String numeroConta) throws ContaInexistenteException {		
		 if(existe(numeroConta)) {
			 contas.remove(numeroConta);
		 }else {
			 throw new ContaInexistenteException(numeroConta);
		 }
	}
}
