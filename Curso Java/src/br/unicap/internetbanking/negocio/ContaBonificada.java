package br.unicap.internetbanking.negocio;

public class ContaBonificada extends Conta {
	
	private double bonus;
	private double taxa= 0.10;

	public ContaBonificada(String numeroConta, double saldo, Cliente cliente){
			
		super(numeroConta,saldo,cliente);
	}
	
	public double getBonus() {
		return bonus;
	}	
	public double getTaxa() {
		return taxa;
	}
	public void renderBonus(){
		creditar(this.bonus);		
		this.bonus = 0;
	}	
	@Override 
	public void creditar(double valor){
		this.bonus = this.bonus + (valor*this.taxa);
		super.creditar(valor);		
	}	
	
}
