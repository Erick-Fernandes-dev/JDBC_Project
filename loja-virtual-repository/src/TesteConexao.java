import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String [] args) throws SQLException {
		
		Connection connection = DriverManager
								.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
		
		System.out.println("Fechando conexão...");

		connection.close();
				
		
		
	}

}
