package br.unicap.internetbanking.negocio;

public class ContaBonificada extends ContaAbstrata {
	
	private double bonus;
	private double taxa;

	public ContaBonificada(String numeroConta, double saldo, Cliente cliente){
		super(numeroConta,saldo,cliente);
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
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
	public void debitar(double valor) {
		double saldo = getSaldo();
		
		if(valor <= saldo){
			setSaldo(saldo - valor);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
}
