package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;

public class Conta extends ContaAbstrata {
	
	
	public Conta(String numeroConta, Cliente cliente){
		super(numeroConta,cliente);
	}
	
	public Conta(String numeroConta, double saldo, Cliente cliente){
		super(numeroConta,saldo,cliente);
	}
	
	
	public void debitar (double valor) throws SaldoInsuficienteException {
			
			
		double saldo = getSaldo();
		if (valor <= saldo) {
			setSaldo(saldo - valor);
		} else {		
			throw new SaldoInsuficienteException(getNumero(),getSaldo());
		}
	}	
	public boolean equals(ContaAbstrata c) {
		return this.getNumero().equals(c.getNumero());
	}
	
}
