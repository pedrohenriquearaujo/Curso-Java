package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;

public class Poupanca extends Conta {
	
	final static double TAXA = 0.10;
	
	public Poupanca(String numeroConta, Cliente cliente) {
		super(numeroConta,cliente);		
	}
	
	public Poupanca(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta,saldo,cliente);		
	}
	
	public void renderJuros(){
		double saldoAtual = getSaldo();
		creditar(saldoAtual*Poupanca.TAXA);
	}
	public void debitar(double valor) throws SaldoInsuficienteException {
		
		double saldo = getSaldo();		
		if(valor <= saldo){
			setSaldo(saldo - valor);
		} else {
			throw new SaldoInsuficienteException(getNumero(),getSaldo());
		}		
	}
	
}
