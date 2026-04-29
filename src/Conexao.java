import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:postgresql://localhost:5432/centec";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha na conexão!" + e.getMessage());
            return null;
        }
    }
}
