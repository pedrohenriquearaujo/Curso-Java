package Aulas;

public class Cliente {
	private String CPF;
	private String nome;
	private String Endereco;
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Cliente (String CPF, String nome, String Endereco) {
		this.CPF = CPF;
		this.nome = nome;
		this.Endereco = Endereco;		
	}	

}

