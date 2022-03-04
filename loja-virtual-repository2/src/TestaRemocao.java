import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		 
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection connection = factory.recuperaConexao();
		
		Statement stm = connection.createStatement();
		// DELETAR
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		Integer linhasModificdas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificdas);
		
	}

}
