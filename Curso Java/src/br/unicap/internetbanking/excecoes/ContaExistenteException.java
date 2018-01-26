package br.unicap.internetbanking.excecoes;

public class ContaExistenteException extends Exception {

	private static final String MSG_CONTA_EXISTENTE = "Cliente Já Consta No Nossa Base de Dados";
	private String numeroConta;
	
	public ContaExistenteException(String numeroConta) {
		super(MSG_CONTA_EXISTENTE);
		this.numeroConta = numeroConta;
	}
	
	public String getNome() {
		return numeroConta;
	}
	public void setNome(String nome) {
		this.numeroConta = nome;
	}
	public String getMessage() {
		return MSG_CONTA_EXISTENTE;
	}
}
