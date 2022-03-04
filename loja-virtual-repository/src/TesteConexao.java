import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String [] args) throws SQLException {
		//TESTE DE CONEX√O
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
<<<<<<< HEAD
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
=======
		Connection connection = connectionFactory.recuperarConexao();
>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
		
		System.out.println("Fechando conex√£o...");

		connection.close();
				
		
		
	}

}
