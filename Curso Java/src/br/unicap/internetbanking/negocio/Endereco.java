package br.unicap.internetbanking.negocio;

public class Endereco {

	private String rua;
	private String bairro;
	private String CEP;
	private String numero;	
	
	
	public Endereco(String rua, String bairro, String CEP, String numero) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.CEP = CEP;
		this.numero = numero;
	}


	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
