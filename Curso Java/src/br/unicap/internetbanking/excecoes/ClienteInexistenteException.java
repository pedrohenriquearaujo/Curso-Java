package br.unicap.internetbanking.excecoes;

public class ClienteInexistenteException extends Exception {
	
	private final static String MSG_CLIENTE_INEXISTENTE = "Cliente Não Existe No Nosso Cadastro, Favor Verificar o Nome Informados";
	private String CPF;
	
	public ClienteInexistenteException(String CPF) {
		super(MSG_CLIENTE_INEXISTENTE);
		this.CPF = CPF;
	}	
	
	public ClienteInexistenteException() {
		super(MSG_CLIENTE_INEXISTENTE);		
	}
	public String getMessage() {
		return MSG_CLIENTE_INEXISTENTE;
	}
	public String getCPF() {
		return CPF;
	}
}
