package Aulas;

public class Conta extends ContaAbstrata {
	
	

	
	public Conta(String numeroConta, double saldo, Cliente cliente){
		super(numeroConta,saldo,cliente);
	}
	
	
	public void debitar (double valor) {		
		
	}	
	public void creditar (double valor) {
		
	}		
	public void transferir(ContaAbstrata c, double valor){		
		this.debitar(valor);
		c.creditar(valor);		
	}
	public boolean equals(ContaAbstrata c) {
		return this.getNumero().equals(c.getNumero());
	}
	
}
