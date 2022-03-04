import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		
<<<<<<< HEAD
		Connection connection = factory.recuperaConexao();
		Statement stm = connection.createStatement();
		
		stm.execute("INSERT INTO PRODUTO (nome, values) VALUES ('Mouse', 'Mouse sem fio')",
					Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			
			Integer id = rst.getInt(1);
			
			
			System.out.println("Os IDs que foram adcionados sao: " + id);
			
			
=======
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		//INSERIR UM NOVO VALOR
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", 
					Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
		}
		
		
		
<<<<<<< HEAD
		
=======
>>>>>>> 4d6cdfecd61f1ce9d9fdc10626423c51f760e26f
	}

}
