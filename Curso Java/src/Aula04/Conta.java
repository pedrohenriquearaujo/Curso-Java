package Aula04;

public class Conta {
	
	private String numero;
	private double saldo;
	
	
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
	public void cretidar (double valor) {
		this.saldo += valor;
	}	
	
}
