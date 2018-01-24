package Aulas;

public class Poupanca extends ContaAbstrata {
	
	public Poupanca(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta,saldo,cliente);		
	}
	
	public void renderJuros(double taxa){
		double saldoAtual = getSaldo();
		creditar(saldoAtual*taxa);
	}

	@Override
	public void debitar(double valor) {
		// TODO Auto-generated method stub
		
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
