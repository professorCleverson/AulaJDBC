
public class TestaAluno {
	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		
		// Inserir
        dao.inserir("Hugunho", "111.222.333-12");
        dao.inserir("Zezinho", "111.222.333-13");

        // Listar
        System.out.println("Lista de alunos:");
        for (String aluno : dao.listar()) {
            System.out.println(aluno);
        }

        // Atualizar
        dao.atualizar(6, "Maria Silva", "123.456.789-90");

        // Deletar
        dao.deletar(2);
	}

}
