package Aulas;

public class Conta {
	
	private String numero;
	private double saldo;

	
	public Conta(String numeroConta, double saldo){
		this.saldo = saldo;
		this.numero = numeroConta;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	public void debitar (double valor) {		
		this.saldo -= valor;
	}	
	public void creditar (double valor) {
		this.saldo += valor;
	}		
	public void transferir(Conta c, double valor){		
		this.debitar(valor);
		c.creditar(valor);		
	}
	public boolean equals(Conta c) {
					
		return this.numero.equals(c.getNumero());
	}
}
