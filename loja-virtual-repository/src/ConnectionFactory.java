import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
<<<<<<< HEAD
	
	public Connection recuperaConexao() throws SQLException {
		// DESIGN PATTERN - FACTORY METHOD
=======
	//DESIGN PATTERN - FACTORY METHOD
	public Connection recuperarConexao() throws SQLException {
		
>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
		return DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=true&serverTimezone=UTC", "root", "tbwa0002");
	}

<<<<<<< HEAD
=======


>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
}
