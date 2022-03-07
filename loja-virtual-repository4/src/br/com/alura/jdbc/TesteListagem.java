package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteListagem {
	
	public static void main(String [] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexao();
		System.out.println("Rodando...");
		//VAI MOSTRAR OS ITENS DE MINHA TABELA
		PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		//Statement stn = con.createStatement();
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		//
		while (rst.next()) {
			
			Integer id = rst.getInt("ID");
			System.out.println(id);
			
			String nome = rst.getString("NOME");
			System.out.println(nome);
			
			
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
						
		}
		con.close();
		
		
				
	}

}
