package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;

public class ContaImposto extends ContaAbstrata {
	
	public static final double TAXA = 0.001;

	public ContaImposto(String numeroConta, Cliente cliente) {
		super(numeroConta, cliente);		
	}
	
	
	public ContaImposto(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
		
	}
	public void debitar(double valor) throws SaldoInsuficienteException {
		double imposto = valor * TAXA;
		double saldo = this.getSaldo();
			if (valor + imposto <= saldo) {
				setSaldo(saldo - (valor + imposto));
			} else {
				throw new SaldoInsuficienteException(getNumero(),getSaldo());
			}
	}
	
}
