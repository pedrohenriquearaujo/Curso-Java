package Aula04;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray r = new RepositorioContasArray();
		
		Conta c = new Conta("123");
		Conta c1 = new Conta("456");
		Conta c2 = new Conta("789");
		Conta c3 = new Conta("753");
		Conta c4 = new Conta("234");
		
		
		r.inserir(c);
		r.inserir(c1);
		r.inserir(c2);
		r.inserir(c3);
		r.inserir(c4);
		
		r.remover(c2.getNumero());
	
		
		
		
	}

}
