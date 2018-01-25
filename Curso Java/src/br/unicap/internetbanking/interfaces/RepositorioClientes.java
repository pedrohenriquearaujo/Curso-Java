package br.unicap.internetbanking.interfaces;

import br.unicap.internetbanking.negocio.Cliente;

public interface RepositorioClientes {

	public void atualizar(Cliente c);
	public boolean existe(String cpf);
	public void inserir(Cliente c);
	public Cliente procurar(String cpf);
	public void remover(String cpf);
	
}
