package Aulas;

import java.util.Scanner;

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
	
		
	
		
<<<<<<< HEAD
		menu(r);
	}
	
	public static void preencher(RepositorioContasArray r){
		
		String numeroConta;
		int saldo;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe numero da Conta: ");
		
		numeroConta = scan.nextLine();
		
		
		System.out.println("Informe valor do Saldo: ");	
		
		saldo = scan.nextInt();
		
		
		Conta c = new Conta(numeroConta, saldo);
		
		r.inserir(c);		
	}
=======
		/*		
		r.inserir(c);
		r.inserir(c1);
		r.inserir(c2);
		r.inserir(c3);
		r.inserir(c4);
>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
	
	public static void menu(RepositorioContasArray r ) {
		
<<<<<<< HEAD
		int op;
		Scanner scan = new Scanner(System.in);
=======
		c4.renderJuros(20);
		*/
		
>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
		
		
		//System.out.println(c3.getSaldo());
		//System.out.println(c3.getNumero());
		preencher(r);
		r.procurar("ABCD");
		
do {
	
	System.out.println("\t\t Cadastro de Contas ");
	System.out.println("\t 1- Inserir ");
	System.out.println("\t 2- Consultar");
	System.out.println("\t 3- Alterar");
	System.out.println("\t 4- Remover");
	System.out.println("\t 5- Listar");
	System.out.println("\t 6- Sair");
	
	op = scan.nextInt();
	
	switch (op){
	
	case 1:{ preencher(r);			
		break;}
	case 2:{
			consultar(r);
		break;}	
	case 3:{
		
<<<<<<< HEAD
		break;}	
	case 4:{
		remover(r);
		break;}	
	case 5:{
	
		break;}
	case 6:{
	
		break;}	
	default:{
		System.out.println("Opção Invalida");			
	}		
=======
			
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
		
>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
	}
	
}while(op != 6);
		scan.close();
	}


	public static void consultar(RepositorioContasArray r) {
		String numero;
		Conta c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe numero da Conta: ");		
		numero = scan.nextLine();		
		
		c = r.procurar(numero);
		
		if(c != null) {		
		System.out.println("Numero: "+r.procurar(numero).getNumero());
		System.out.println("Saldo: "+r.procurar(numero).getSaldo());
		}		
		
	}
	
	public static void remover(RepositorioContasArray r) {
		
		String numero;
		Conta c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe numero da Conta: ");		
		numero = scan.nextLine();		
		
		c = r.procurar(numero);
		
		if(c != null) {					
			r.remover(c.getNumero());
		}
	}
}
