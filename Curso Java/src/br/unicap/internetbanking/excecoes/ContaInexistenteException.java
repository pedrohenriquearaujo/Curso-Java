package br.unicap.internetbanking.excecoes;

public class ContaInexistenteException extends Exception {
	
	private final static String MSG_CONTA_INEXISTENTE="Conta Não Existe No Nosso Cadastro, Favor Verificar o Numero e Senha Informados";
	private String numeroConta;
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public String getMessage() {
		return MSG_CONTA_INEXISTENTE;
	}

	public ContaInexistenteException(String numeroConta) {
		super(MSG_CONTA_INEXISTENTE);
		this.numeroConta = numeroConta;
	}
	
}
