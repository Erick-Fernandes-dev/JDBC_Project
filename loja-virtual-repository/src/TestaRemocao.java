import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
<<<<<<< HEAD
		 
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection connection = factory.recuperaConexao();
		
		Statement stm = connection.createStatement();
		// DELETAR
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		Integer linhasModificdas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificdas);
=======
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		//DELETAR
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: " 
							+ linhasModificadas);
>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
		
	}

}
