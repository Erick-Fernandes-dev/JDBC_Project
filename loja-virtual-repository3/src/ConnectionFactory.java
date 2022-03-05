import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperaConexao() throws SQLException {
		// DESIGN PATTERN - FACTORY METHOD
		return DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
	}

}
