import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteListagem {
	
	public static void main(String [] args) throws SQLException {
		
		Connection con = DriverManager
						.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
		
		System.out.println("Rodando...");
		
		
		Statement stn = con.createStatement();
		stn.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		ResultSet rst = stn.getResultSet();
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
