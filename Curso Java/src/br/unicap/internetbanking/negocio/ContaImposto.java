package br.unicap.internetbanking.negocio;

public class ContaImposto extends ContaAbstrata {
	
	public static final double TAXA = 0.001;

	public ContaImposto(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
		
	}
	public void debitar(double valor){
		double imposto = valor * TAXA;
		double saldo = this.getSaldo();
			if (valor + imposto <= saldo) {
				setSaldo(saldo - (valor + imposto));
			} else {
				System.out.println("Saldo Insuficiente");
			}
	}
	
}
