package br.unicap.internetbanking.interfaces;

import br.unicap.internetbanking.negocio.ContaAbstrata;

public interface RepositorioContas {
	public void inserir(ContaAbstrata c);
	public boolean existe(String num);
	public void atualizar(ContaAbstrata c);
	public ContaAbstrata procurar(String num);
	public void remover(String num);

}
