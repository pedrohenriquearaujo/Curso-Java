package br.unicap.internetbanking.excecoes;

public class SaldoInsuficienteException extends Exception {
	
	private String numeroConta;
	private double saldoAtual;
	private static final String MSG_SALDO_INSUFICIENTE = "Saldo Insuficiente Para Realizar Opera��o de D�bido Ou de Transfer�ncia!";
	
	
	public SaldoInsuficienteException(String numeroConta, double saldo) {
		
		super(MSG_SALDO_INSUFICIENTE);
		this.numeroConta = numeroConta;
		this.saldoAtual = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}
	
	
}
