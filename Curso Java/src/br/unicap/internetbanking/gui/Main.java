package br.unicap.internetbanking.gui;

import br.unicap.internetbanking.excecoes.ClienteExistenteException;
import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;
import br.unicap.internetbanking.negocio.Cliente;
import br.unicap.internetbanking.negocio.Conta;
import br.unicap.internetbanking.negocio.ContaAbstrata;
import br.unicap.internetbanking.negocio.ContaBonificada;
import br.unicap.internetbanking.negocio.ContaImposto;
import br.unicap.internetbanking.negocio.Fachada;
import br.unicap.internetbanking.negocio.Poupanca;
import br.unicap.internetbanking.negocio.TipoCliente;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		Fachada f = Fachada.getInstacia();
			
		Cliente cliente =  new Cliente("077", "Pedro","Av. Dantas Barreto","Boa Vista","5300-000","57");
		
		
		
		ContaAbstrata c = new Conta("1", 100,cliente);		
		ContaAbstrata p = new Poupanca("2",100,cliente);
		ContaAbstrata b = new ContaBonificada("3", 100,cliente);
		ContaAbstrata i = new ContaImposto("4", 100,cliente);
		Conta conta = new Conta("1", 100,cliente);
	
		
		//f.cadastrar(c);
		//f.cadastrar(p);
		//f.cadastrar(b);
		//f.cadastrar(i);
		
	
		
		try {
			
			f.cadastrar(new Cliente("6", "Pedro","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			f.cadastrar(new Cliente("5", "Fernando","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			f.cadastrar(new Cliente("4", "Jose","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			f.cadastrar(new Cliente("3", "Joao","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			f.cadastrar(new Cliente("2", "Matheus","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			f.cadastrar(new Cliente("1", "Carlos","Av. Dantas Barreto","Boa Vista","5300-000","57"));
			
			
			f.descadastrarCliente("3");
			f.exibir();
			/*cliente = f.procurarCliente("077");
			f.procurarConta(conta.getNumero());
			conta.debitar(500);
			System.out.println(conta.getSaldo());*/
			}
		catch(ClienteExistenteException e){
				System.out.println(e.getMessage());
				System.out.println("CPF: " + e.getNome());
		}catch(ClienteInexistenteException e){
			System.out.println(e.getMessage());
			System.out.println("CPF: " + e.getCPF());
		}
		
		
		
		/*
		f.creditar("1", 200);
		f.creditar("2", 200);
		f.creditar("3", 200);
		f.creditar("4", 200);
		
		f.debitar("1", 200);
		f.debitar("2", 200);
		f.debitar("3", 200);
		f.debitar("4", 200);
		
		
		System.out.println(f.procurarConta("1").getSaldo());
		System.out.println(f.procurarConta("2").getSaldo());
		System.out.println(f.procurarConta("3").getSaldo());
		System.out.println(f.procurarConta("4").getSaldo());	
		*/
		

	
		
		
		
	}
	/*
	public static void preencher(RepositorioContasArray r){
		Cliente cliente = null;
		String nome = "";
		String numeroConta;
		String CPF = "";
		int saldo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe numero da Conta: ");
		
		numeroConta = scan.nextLine();
		
		
		System.out.println("Informe valor do Saldo: ");	
		
		saldo = scan.nextInt();
		
		cliente = new Cliente(CPF,nome);
		ContaAbstrata conta = new Conta(numeroConta,saldo, cliente);
		ContaAbstrata conta1 = new Poupanca(numeroConta,saldo, cliente);
		conta1.creditar(500);
		r.inserir(conta1);		
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
		System.out.println("Op��o Invalida");}		
	
	}
	


  }while(op != 6);

}
	public static void consultar(RepositorioContasArray r) {
		String numero;
		ContaAbstrata c;
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
		ContaAbstrata c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe numero da Conta: ");		
		numero = scan.nextLine();		
		
		c = r.procurar(numero);
		
		if(c != null) {					
			r.remover(c.getNumero());
		}
	}

*/

}
