package Aulas;

public class Poupanca extends Conta {
	
	public Poupanca(String numeroConta, double saldo) {
		super(numeroConta,saldo);		
	}
	
	public void renderJuros(double taxa){
		double saldoAtual = getSaldo();
		creditar(saldoAtual*taxa);
	}
	

}
