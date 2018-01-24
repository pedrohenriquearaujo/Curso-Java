package Aulas;

public class ContaBonificada extends ContaAbstrata {
	
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

	public ContaBonificada(String numeroConta, double saldo, Cliente cliente){
		super(numeroConta,saldo,cliente);
	}
	
	public void renderBonus(){
		creditar(this.bonus);		
		this.bonus = 0;
	}
	
	@Override 
	public void creditar(double valor){
		this.bonus = this.bonus + (valor*this.taxa);
		creditar(valor);		
	}

	@Override
	public void debitar(double valor) {
		debitar(valor);
		
	}

	@Override
	public void transferir(ContaAbstrata conta, double valor) {
		this.creditar(valor);
		conta.debitar(valor);
	}
	
	
	
	

}
