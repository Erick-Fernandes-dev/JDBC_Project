import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//DESIGN PATTERN - FACTORY METHOD
	public Connection recuperarConexao() throws SQLException {
		
		return DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
	}



}
