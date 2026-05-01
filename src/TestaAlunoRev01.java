import java.util.Scanner;

public class TestaAlunoRev01 {
	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		int opcao = 0, resp = 1;
		String nome, cpf;
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		while(resp == 1) {
			System.out.println("INDIQUE A OPERAÇÃO DESEJADA");
			System.out.println("1 = Inserir;");
			System.out.println("2 = Listar;");
			System.out.println("3 = Atualizar;");
			System.out.println("4 = Deletar.");
			opcao = scInt.nextInt();
			
			switch (opcao) {
			case 1:
				// Inserir
				System.out.println("Nome: ");
				nome = scString.nextLine();
				System.out.println("CPF: ");
				cpf = scString.nextLine();
				dao.inserir(nome, cpf);
				break;
			case 2:
				// Listar
		        System.out.println("Lista de alunos:");
		        for (String aluno : dao.listar()) {
		            System.out.println(aluno);
		        }
				break;
			case 3:
			case 4:
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("\nContinuar? 1 = Sim / 2 = Não ");
			resp = scInt.nextInt();
			
		}
		
        

        

        // Atualizar
        dao.atualizar(6, "Maria Silva", "123.456.789-90");

        // Deletar
        dao.deletar(2);
	}

}
