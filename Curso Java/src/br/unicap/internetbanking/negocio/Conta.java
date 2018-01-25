package br.unicap.internetbanking.negocio;

public class Conta extends ContaAbstrata {
	
	

	
	public Conta(String numeroConta, double saldo, Cliente cliente){
		super(numeroConta,saldo,cliente);
	}
	
	
	public void debitar (double valor) {
		
		double saldo = getSaldo();
		
			if(valor <= saldo){
				setSaldo(saldo - valor);
			} else {
				System.out.println("Saldo insuficiente");
			}
	}	
	public boolean equals(ContaAbstrata c) {
		return this.getNumero().equals(c.getNumero());
	}
	
}
