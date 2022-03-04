import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		 
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection connection = factory.recuperaConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > 2");
		
		//Statement stm = connection.createStatement();
		// DELETAR
		stm.execute();
		
		Integer linhasModificdas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificdas);
		
	}

}
