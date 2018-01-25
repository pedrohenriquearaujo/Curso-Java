package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioClientesArray;
import br.unicap.internetbanking.dados.RepositorioContasArray;

public class Fachada {
	
	private static Fachada instancia;
	private CadContas contas;
	private CadClientes clientes;
	
	
	public CadContas getContas() {
		return contas;
	}

	public void setContas(CadContas contas) {
		this.contas = contas;
	}

	public static Fachada getInstacia() {
		if(instancia == null) {
			instancia = new Fachada();
		}		
		return instancia;		
	}
	
	private Fachada () {
		initCadastros();
	}
	
	private void initCadastros() {		
		contas = new CadContas(new RepositorioContasArray());		
		clientes = new CadClientes(new RepositorioClientesArray());
	}
	
	//Cliente
	
	public void atualizar (Cliente c) {
		clientes.atualizar(c);
	}
	public Cliente procurarCliente(String cpf) {
		return clientes.procurar(cpf);
	}
	public void cadastrar(Cliente c) {
		clientes.inserir(c);
	}
	public void descadastrarCliente(String cpf) {
		clientes.remover(cpf);
	}
	
	//Conta
	

	public void atualizar (ContaAbstrata conta) {
		contas.atualizar(conta);
	}
	public ContaAbstrata procurarConta(String numeroConta) {
		return contas.procurar(numeroConta);
	}
	public void cadastrar(ContaAbstrata conta) {
		Cliente cliente = conta.getCliente();
			if (cliente != null) {
				//clientes.procurar(cliente.getCPF());
				contas.inserir(conta);
			} else {
				System.out.println("Cliente Não Declarando");
			}
	}
	
	public void removerConta(String n) {
		contas.remover(n);
	}
	public void creditar(String n, double v) {
		contas.creditar(n, v);
	}
	public void debitar(String n, double v) {
		contas.debitar(n, v);
	}
	public void transferir(String origem,String destino, double val) {
		contas.transferir(origem, destino, val);
	}

	
	
}
