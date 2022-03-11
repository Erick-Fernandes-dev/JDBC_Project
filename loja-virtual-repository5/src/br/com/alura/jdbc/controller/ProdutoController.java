package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();

		this.produtoDAO = new ProdutoDAO(connection);
	}

	// DELETAR
	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	// SALVAR
	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}
	
	// LISTAR
	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	// ALTERAR
	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}