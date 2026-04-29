
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
	
	// INSERT
    public void inserir(String nome, String cpf) {
        String sql = "INSERT INTO alunos(nome, cpf) VALUES (?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT
    public List<String> listar() {
        List<String> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                alunos.add(rs.getInt("id_aluno") + " - " + rs.getString("nome") + " - " + rs.getString("cpf"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    // UPDATE
    public void atualizar(int id_aluno, String novoNome, String novoCpf) {
        String sql = "UPDATE alunos SET nome = ?, cpf = ? WHERE id_aluno = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoCpf);
            stmt.setInt(3, id_aluno);
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deletar(int id_aluno) {
        String sql = "DELETE FROM alunos WHERE id_aluno = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_aluno);
            stmt.executeUpdate();
            System.out.println("Aluno deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
