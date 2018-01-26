package br.unicap.internetbanking.negocio;

import br.unicap.internetbanking.dados.RepositorioClientesArray;
import br.unicap.internetbanking.dados.RepositorioContasArray;
import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.excecoes.SaldoInsuficienteException;

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
	public Cliente procurarCliente(String cpf) throws ClienteInexistenteException {
		return clientes.procurar(cpf);
	}
	public void cadastrar(Cliente c) {
		clientes.inserir(c);
	}
	public void descadastrarCliente(String cpf) {
		clientes.remover(cpf);
	}
	
	//Conta
	

	public void atualizar (ContaAbstrata conta) throws ContaInexistenteException{
		contas.atualizar(conta);
	}
	public ContaAbstrata procurarConta(String numeroConta) throws ContaInexistenteException {
		return contas.procurar(numeroConta);
	}
	public void cadastrar(ContaAbstrata conta) throws ClienteInexistenteException {
		Cliente cliente = conta.getCliente();
			if (cliente != null) {
				clientes.procurar(cliente.getCPF());
				contas.inserir(conta);
			} else {
				System.out.println("Cliente Não Declarando");
			}
	}
	
	public void removerConta(String n) {
		contas.remover(n);
	}
	public void creditar(String n, double v) throws ContaInexistenteException{
		contas.creditar(n, v);
	}
	public void debitar(String n, double v) throws SaldoInsuficienteException, ContaInexistenteException {
		contas.debitar(n, v);
	}
	public void transferir(String origem,String destino, double val) throws SaldoInsuficienteException, ContaInexistenteException {
		contas.transferir(origem, destino, val);
	}
	
	//Poupanca
	
	public void RenderJuros(String numeroConta) throws ContaInexistenteException {
		ContaAbstrata c = contas.procurar(numeroConta);
		if(c instanceof Poupanca) {
			((Poupanca) c).renderJuros();
		}		
	}
	//Conta Bonificada
	public void RenderBonus(String numeroConta) throws ContaInexistenteException {
		ContaAbstrata c = contas.procurar(numeroConta);
		if(c instanceof ContaBonificada) {
			((ContaBonificada) c).renderBonus();
		}	
	}
	
	
}
