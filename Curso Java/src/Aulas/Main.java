package Aulas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray r = new RepositorioContasArray();
		
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
	
	public static void menu(RepositorioContasArray r ) {
		
		int op;
		Scanner scan = new Scanner(System.in);
		
		
		
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
