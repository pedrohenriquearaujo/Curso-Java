package Aulas;

public class Poupanca extends Conta {
	
	public Poupanca(String numeroConta) {
		super(numeroConta);		
	}
	
	public void renderJuros(double taxa){
		double saldoAtual = getSaldo();
		creditar(saldoAtual*taxa);
	}
	

}
