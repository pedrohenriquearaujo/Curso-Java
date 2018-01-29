package br.unicap.internetbanking.interfaces;

import br.unicap.internetbanking.excecoes.ContaExistenteException;
import br.unicap.internetbanking.excecoes.ContaInexistenteException;
import br.unicap.internetbanking.negocio.ContaAbstrata;

public interface IRepositorioContas {
	public void inserir(ContaAbstrata c) throws ContaInexistenteException;
	public boolean existe(String num);
	public void atualizar(ContaAbstrata c);
	public ContaAbstrata procurar(String num) throws ContaInexistenteException;
	public void remover(String num) throws ContaInexistenteException, ContaExistenteException;

}
