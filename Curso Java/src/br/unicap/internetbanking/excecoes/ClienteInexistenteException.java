package br.unicap.internetbanking.excecoes;

public class ClienteInexistenteException extends Exception {
	
	private final static String MSG_CLIENTE_INEXISTENTE = "Cliente Não Existe No Nosso Cadastro, Favor Verificar o Nome Informados";
	private String nome;
	
	public ClienteInexistenteException(String Cliente) {
		super(MSG_CLIENTE_INEXISTENTE);
		this.nome = Cliente;
	}
	
	public String getNome() {
		return nome;
	}	
	public String getMessage() {
		return MSG_CLIENTE_INEXISTENTE;
	}
}
