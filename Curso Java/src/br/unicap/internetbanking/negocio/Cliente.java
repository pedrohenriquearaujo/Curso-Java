package br.unicap.internetbanking.negocio;

public class Cliente implements Comparable<Cliente>{
	private String CPF;
	private String nome;
	private Conta c;
	private Endereco endereco;
	private static TipoCliente tipo;
	
	public Cliente(String CPF, String nome, TipoCliente tipo) {	
		this.CPF = CPF;
		this.nome = nome;
		this.tipo = tipo;
	}	
	public Cliente(String CPF, String nome, Endereco endereco) {		
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
	}
	public Cliente(String CPF, String nome,String rua,String bairro,String CEP,String numero) {		
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = new Endereco(rua, bairro, CEP, numero);
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public boolean equals(Cliente c){		
		return CPF.equals(c.getCPF());		
	}
	
	@Override
	public String toString() {		
		return this.nome;
	}
	
	public int compareTo(Cliente c) {		
		return this.nome.compareTo(c.getNome());
	}
	
	

}


