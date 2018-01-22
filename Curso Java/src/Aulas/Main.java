package Aulas;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray r = new RepositorioContasArray();
		
		Conta c = new Conta("123");
		Conta c1 = new Conta("456");
		Conta c2 = new Conta("789");
		Conta c3 = new Poupanca("753");
		Poupanca c4 = new Poupanca("234");
				
		r.inserir(c);
		r.inserir(c1);
		r.inserir(c2);
		r.inserir(c3);
		r.inserir(c4);
	
		c3.creditar(200);
		((Poupanca)c3).renderJuros(2);
		c3.debitar(20);
		
		c4.renderJuros(20);
		
		System.out.println(c3.getSaldo());
		System.out.println(c3.getNumero());
		
		
		
	}

}
