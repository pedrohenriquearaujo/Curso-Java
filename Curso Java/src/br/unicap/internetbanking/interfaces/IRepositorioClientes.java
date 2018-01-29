package br.unicap.internetbanking.interfaces;

import br.unicap.internetbanking.excecoes.ClienteInexistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.negocio.Cliente;

public interface IRepositorioClientes {

	public void atualizar(Cliente c) throws ClienteInexistenteException;
	public boolean existe(String cpf);
	public void inserir(Cliente c);
	public Cliente procurar(String cpf) throws ClienteInexistenteException;
	public void remover(String cpf) throws ClienteInexistenteException;
	
}
