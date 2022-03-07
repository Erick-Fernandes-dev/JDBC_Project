package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	//pool de conexao
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("tbwa0002");
		
		comboPooledDataSource.setMaxPoolSize(15);// NUMERO MAXIMO DE CONEXOES, OU SEJA, SAO DE 15 CONEXOES
		
		this.dataSource = comboPooledDataSource;
		
	}
	
	public Connection recuperaConexao() throws SQLException {
		
		return this.dataSource.getConnection();	
		
	}
	
//	public Connection recuperaConexao() throws SQLException {
//		// DESIGN PATTERN - FACTORY METHOD
//		return DriverManager
//				.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
//	}

	
}
