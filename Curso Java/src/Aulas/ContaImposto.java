package Aulas;

public class ContaImposto extends ContaAbstrata {
	
	public static final double TAXA = 0.001;

	public ContaImposto(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
		
	}
	public void debitar(double valor){
		double imposto = valor * TAXA;
		debitar(valor + imposto);
	}
	@Override
	public void creditar(double valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferir(ContaAbstrata conta, double valor) {
		// TODO Auto-generated method stub
		
	}


}
