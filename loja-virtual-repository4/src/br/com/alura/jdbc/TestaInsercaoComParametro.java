package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		// USANDO PREPARED_STATEMENT PARA EVITAR INVASOES COM SQL INJECTION...

		ConnectionFactory factory = new ConnectionFactory();
		try (Connection connection = factory.recuperaConexao()) {

			connection.setAutoCommit(false);

			try (PreparedStatement stm = connection.prepareStatement(
					"INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {

				adcionarVariavel("SmartTV", "45 polegadas", stm);
				adcionarVariavel("Radio", "Radio de bateria", stm);

				connection.commit();

			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				connection.rollback();

			}
		}

	}

	private static void adcionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		if (nome.equals("Radio")) {

			throw new RuntimeException("Nao foi possivel adicionar o produto");

		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {

				Integer id = rst.getInt(1);

				System.out.println("Os IDs que foram criados sao: " + id);

			}

		}
	}

}
