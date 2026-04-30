import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoExemplo {
	public static void main(String[] args) {
		
		String URL = "jdbc:postgresql://localhost:5432/centec";
	    String USER = "postgres";
	    String PASSWORD = "12345678";
	    
	    try {
	    	Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	    	System.out.println("Conexão bem Ok!");
	    	
	    	conn.close();
	    }catch(SQLException e){
	    	System.out.println("Erro ao conectar!" + e.getMessage());
	    }
	}

}
