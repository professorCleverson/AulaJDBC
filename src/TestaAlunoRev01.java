import java.util.Scanner;

public class TestaAlunoRev01 {
	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		int opcao = 0, resp = 1, cod = 0;
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
				//Atualizar
				System.out.println("Código:");
				cod = scInt.nextInt();
				System.out.println("Novo Nome:");
				nome = scString.nextLine();
				System.out.println("Novo CPF:");
				cpf = scString.nextLine();
				
				dao.atualizar(cod, nome, cpf);
				break;
			case 4:
				System.out.println("Código:");
				cod = scInt.nextInt();
				
				dao.deletar(cod);
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("\nContinuar? 1 = Sim / 2 = Não ");
			resp = scInt.nextInt();
		}
	}
}
