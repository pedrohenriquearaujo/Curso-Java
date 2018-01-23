package Aulas;

public class ContaBonificada extends Conta {
	
	private double bonus;
	private double taxa;
	
	
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

	public ContaBonificada(String numeroConta, double saldo){
		super(numeroConta,saldo);
	}
	
	public void renderBonus(){
		super.creditar(this.bonus);		
		this.bonus = 0;
	}
	
	@Override 
	public void creditar(double valor){
		this.bonus = this.bonus + (valor*this.taxa);
		super.creditar(valor);		
	}
	
	
	
	

}
