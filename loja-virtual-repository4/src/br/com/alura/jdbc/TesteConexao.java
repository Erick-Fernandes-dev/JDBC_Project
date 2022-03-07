package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String [] args) throws SQLException {
		//TESTANDO CONEXAO
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		
		System.out.println("Fechando conexão...");

		connection.close();
				
		
		
	}

}
