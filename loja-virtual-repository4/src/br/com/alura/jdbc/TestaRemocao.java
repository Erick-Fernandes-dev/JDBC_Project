package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		 
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection connection = factory.recuperaConexao();
		
		// DELETAR
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		
		//Statement stm = connection.createStatement();
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificdas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificdas);
		
	}

}
