import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.ConnectionFactory;
import br.com.alura.jdbc.dao.CategoriaDao;
import br.com.alura.jdbc.modelo.Categoria;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().recuperaConexao()) {

			CategoriaDao categoriaDao = new CategoriaDao(connection);
			List<Categoria> listaDeCategorias = categoriaDao.listarComProdutos();

			listaDeCategorias.stream().forEach(ct -> {

				System.out.println(ct.getNome());

//				try {
//					for (Produto produto : new ProdutoDAO(connection).buscar(ct)) {
//
//						System.out.println(ct.getNome() + " - " + produto.getNome());
//
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}

			});

		}

	}

}
