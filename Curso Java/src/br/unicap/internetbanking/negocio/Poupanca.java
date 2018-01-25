package br.unicap.internetbanking.negocio;

public class Poupanca extends ContaAbstrata {
	
	final static double TAXA = 0.10;
	
	public Poupanca(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta,saldo,cliente);		
	}
	
	public void renderJuros(){
		double saldoAtual = getSaldo();
		creditar(saldoAtual*Poupanca.TAXA);
	}
	public void debitar(double valor) {
		
		double saldo = getSaldo();		
		if(valor <= saldo){
			setSaldo(saldo - valor);
		} else {
			System.out.println("Saldo insuficiente");
		}		
	}
	
}
