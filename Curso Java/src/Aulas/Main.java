package Aulas;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray r = new RepositorioContasArray();
		//Conta c = new Conta("123456", 200.5);
		/*
		ContaBonificada c3 = (ContaBonificada) new Conta(null, 0);
		c3.renderBonus();
		Poupanca c1 = new Poupanca(null);
		c1.transferir(c1, 200);
		c.transferir(c1, 50);
		c1.renderJuros(20);
		*/
	
		
	
		
		/*		
		r.inserir(c);
		r.inserir(c1);
		r.inserir(c2);
		r.inserir(c3);
		r.inserir(c4);
	
		c3.creditar(200);
		((Poupanca)c3).renderJuros(2);
		c3.debitar(20);
		
		c4.renderJuros(20);
		*/
		
		
		
		//System.out.println(c3.getSaldo());
		//System.out.println(c3.getNumero());
		preencher(r);
		r.procurar("ABCD");
		
		
			
	}
	
	public static void preencher(RepositorioContasArray r){
		Conta c = new Conta("123456", 200.0);

		Conta c1 = new Conta("456",200.0);
		Conta c2 = new Conta("789",200.0);
		Conta c3 = new Poupanca("753",100.1);
		Poupanca c4 = new Poupanca("234",56.4);			
		r.inserir(c);
		r.inserir(c1);
		r.inserir(c2);
		r.inserir(c3);
		r.inserir(c4);
		
	}

}
