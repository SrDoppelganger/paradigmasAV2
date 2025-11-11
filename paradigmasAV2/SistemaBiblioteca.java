package paradigmasAV2;
import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		bibliotecaCLI(scan);
	}
	
	public static void bibliotecaCLI(Scanner scan) {
		System.out.println("===BIBLIOTECA CIDADÃ===");
		
		System.out.println("1-Cadastrar Usuário\n2-Consultar Cadastros\n3-Atualizar Cadastros\n4-Deletar Cadastros\n5-Fazer empréstimo\n6-Realizar Devolução\n7-Gerar relatório\n0-Sair");
		int escolha = scan.nextInt();
		
		switch(escolha) {
			case 1:
				//add função de cadastrar usuários
				addUsuario(scan);
				break;
			case 2:
				//add função de consultar usuários
				System.out.println("WIP 2");
				break;
			case 3:
				//add função de atualizar usuários
				System.out.println("WIP 3");
				break;
			case 4:
				//add função de deletar usuários
				System.out.println("WIP 4");
				break;
			case 5:
				//add função de fazer empréstimo
				System.out.println("WIP 5");
				break;
			case 6:
				//add função de devolução
				System.out.println("WIP 6");
				break;
			case 7:
				//add função de gerar relatório
				System.out.println("WIP 7");
				break;
			default:
				System.out.println("Desligando o sistema...");
				scan.close();
				break;
		}
	}
	
	public static void addUsuario(Scanner scan) {
		System.out.println("===ADICIONAR USUÁRIO===");
		
		System.out.println("nome:");
		String nomeUser = scan.next();
		
		
		System.out.println("documento(RG):");
		int documentoUser = scan.nextInt();
		
		System.out.println("ocupação:\n1-Aluno\n2-Servidor\n3-Visitante");
		int userType = scan.nextInt();
		
		//TODO achar um jeito melhor de fazer isso T .T
		switch(userType) {
			case 1:
				Aluno aluno1 = new Aluno();
				aluno1.setNome(nomeUser);
				aluno1.setDocumento(documentoUser);
				
				System.out.println(aluno1.getNome());
				break;
			case 2:
				Servidor servidor1 = new Servidor();
				servidor1.setNome(nomeUser);
				servidor1.setDocumento(documentoUser);
				break;
			case 3:
				Visitante visitante1 = new Visitante();
				visitante1.setNome(nomeUser);
				visitante1.setDocumento(documentoUser);
				break;
		}
		
		//retorna ao menu principal
		
		bibliotecaCLI(scan);
		
	}
	
	public static void consultarUsuario(Aluno aluno) {
		//WIP
	}

}