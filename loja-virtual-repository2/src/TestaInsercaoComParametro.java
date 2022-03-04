import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
	
	public static void main(String[] args) throws SQLException {
		
		// USANDO PREPARED_STATEMENT PARA EVITAR INVASOES COM SQL INJECTION...
		
		String nome = "Mouse";
		String descricao = "Mouse sem fio";
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		
		PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
						Statement.RETURN_GENERATED_KEYS);
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		while (rst.next()) {
			
			Integer id = rst.getInt(1);
			
			System.out.println("Os IDs que foram criados sao: " + id);
			
		}
		
		
	}

}
