package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioContaMap;
import br.unicap.internetbanking.dados.RepositorioContasArray;
import br.unicap.internetbanking.excecoes.ContaExistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;

public class CadContas {
	
	//private RepositorioContasArray r;
	private RepositorioContaMap r;
	/*
	public CadContas(RepositorioContasArray r) {
		this.r = r;
	}*/
	
	public CadContas(RepositorioContaMap r) {
		this.r = r;
	}

	public void inserir(ContaAbstrata c) throws ContaExistenteException {
		
		if(!r.existe(c.getNumero())){		
			r.inserir(c);
		}else{
			throw new ContaExistenteException(c.getNumero());
		}
	}	
	public void atualizar (ContaAbstrata c) throws ContaInexistenteException {
			if(r.procurar(c.getNumero()) != null) {
				r.atualizar(c);
			}else {
				throw new ContaInexistenteException(c.getNumero());
			}
	}	
	public void remover (String numeroConta) throws ContaInexistenteException{
			r.remover(numeroConta);	
	}
	public ContaAbstrata procurar(String numeroConta) throws ContaInexistenteException{
		return r.procurar(numeroConta);		
	}
	public void creditar(String n, double v) throws ContaInexistenteException, SaldoInsuficienteException  {
		ContaAbstrata c = r.procurar(n);		
		c.creditar(v);
	}
	
	public void debitar(String n, double v) throws SaldoInsuficienteException, ContaInexistenteException {
		ContaAbstrata c = r.procurar(n);	
		c.debitar(v);		
	}

	public void transferir(String origem, String destino, double val) throws SaldoInsuficienteException, ContaInexistenteException {
		ContaAbstrata o = r.procurar(origem);
		ContaAbstrata d = r.procurar(destino);
		o.transferir(d, val);
		
	}
	
}
