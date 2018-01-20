package Aulas;

public class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta(String numeroConta){
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
	
}
