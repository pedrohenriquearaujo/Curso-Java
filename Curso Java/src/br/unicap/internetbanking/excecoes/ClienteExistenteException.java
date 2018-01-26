package br.unicap.internetbanking.excecoes;

public class ClienteExistenteException extends Exception {
	
	private static final String MSG_CLIENTE_EXISTENTE = "Cliente Já Consta No Nossa Base de Dados";
	private String nome;
	
	public ClienteExistenteException(String nomeCliente) {
		super(MSG_CLIENTE_EXISTENTE);
		this.nome = nomeCliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMessage() {
		return MSG_CLIENTE_EXISTENTE;
	}
	
}
