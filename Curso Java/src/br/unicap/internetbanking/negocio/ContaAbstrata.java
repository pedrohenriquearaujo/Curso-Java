package br.unicap.internetbanking.negocio;

public abstract class ContaAbstrata {
	
	
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	
	public ContaAbstrata(String numeroConta, Cliente cliente) {
		this.numero = numeroConta;
		this.cliente = cliente;
	}
	public ContaAbstrata(String numeroConta, double saldo, Cliente cliente) {
		this.numero = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public abstract void debitar(double valor);
	public void creditar(double valor) {
		this.saldo += valor;
	}
	public void transferir(ContaAbstrata conta,double valor) {
		this.debitar(valor);
		conta.creditar(valor);
	}
}
