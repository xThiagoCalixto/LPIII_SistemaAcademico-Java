package Programa;

import java.util.Scanner;

import entities.Aluno;
import entities.Professor;
import entities.SistemaAcademico;

public class Principal {

	static SistemaAcademico sa = new SistemaAcademico();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("Escolha a opcao" 
					+ "\n1- Cadastrar Aluno" 
					+ "\n2- Cadastrar Professor"
					+ "\n3- Excluir Aluno" 
					+ "\n4- Excluir Professor" 
					+ "\n5- Alterar Aluno" 
					+ "\n6- Alterar Professor"
					+ "\n7- Pesquisar Aluno" 
					+ "\n8- Pesquisar Professor"
					+ "\n9- Listar Alunos"
					+ "\n10- Sair");
			opcao = sc.nextInt();
			String nome, endereco, telefone, materia, curso;
			char sexo;
			int registro, ra;

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Aluno:");
				System.out.println("Digite o RA");
				ra = sc.nextInt();
				System.out.println("Digite o nome");
				sc.next();
				nome = sc.nextLine();
				System.out.println("Digite o curso");
				curso = sc.nextLine();
				System.out.println("Digite o endereço");
				endereco = sc.nextLine();
				System.out.println("Digite o telefone");
				telefone = sc.nextLine();
				System.out.println("Digite o Sexo (M/F)");
				sexo = sc.next().charAt(0);
				Aluno a = new Aluno(nome, endereco, telefone, sexo, ra, curso);
				sa.cadastrarAluno(a);
				break;

			case 2:
				System.out.println("Cadastrar Professor:");
				System.out.println("Digite o Registro");
				registro = sc.nextInt();
				System.out.println("Digite o nome");
				sc.next();
				nome = sc.nextLine();
				System.out.println("Digite a materia");
				materia = sc.nextLine();
				System.out.println("Digite o endereço");
				endereco = sc.nextLine();
				System.out.println("Digite o telefone");
				telefone = sc.nextLine();
				System.out.println("Digite o Sexo (M/F)");
				sexo = sc.next().charAt(0);
				Professor p = new Professor(nome, endereco, telefone, sexo, registro, materia);
				sa.cadastrarProfessor(p);
				break;
			case 3:
				System.out.println("Digite o RA do aluno a ser excluido");
				ra = sc.nextInt();
				sa.removerAluno(ra);
				break;
			case 4:
				//Excluir Professor
				System.out.println("Digite o registro do professor a ser excluido");
				registro = sc.nextInt();
				sa.removerProfessor(registro);
				break;
			case 5:
				//Alterar Aluno
				System.out.println("Digite o RA do aluno a ser alterado");
				ra = sc.nextInt();
				sa.alterarAluno(ra);
				break;
			case 6:
				//Alterar Professor
				System.out.println("Digite o registro do professor a ser alterado");
				registro = sc.nextInt();
				sa.alterarProfessor(registro);
				break;
			case 7:
				//Pesquisar Aluno
				System.out.println("Digite o RA do aluno para pesquisa");
				ra = sc.nextInt();
				sa.pesquisarAluno(ra);
				break;
			case 8:
				//Pesquisar Professor
				System.out.println("Digite o registro do professor a ser excluido");
				registro = sc.nextInt();
				sa.removerProfessor(registro);
				break;
			case 9:
				//Listar Alunos
				sa.listarAlunos();
				break;
			}
		} while (opcao < 10);
		
	}
	
	
	/*
	 * String nome, endereco, telefone, curso; char sexo; int ra;
	 * System.out.println("Cadastrar Aluno:"); System.out.println("Digite o RA"); ra
	 * = sc.nextInt(); System.out.println("Digite o nome"); sc.next(); nome =
	 * sc.nextLine(); System.out.println("Digite o curso"); curso = sc.nextLine();
	 * System.out.println("Digite o endereço"); endereco = sc.nextLine();
	 * System.out.println("Digite o telefone"); telefone = sc.nextLine();
	 * System.out.println("Digite o Sexo (M/F)"); sexo = sc.next().charAt(0); Aluno
	 * a = new Aluno(nome, endereco, telefone, sexo, ra, curso);
	 * SA.cadastrarAluno(a);
	 */
}

/*
 * 
 * package entities;
 * 
 * import java.util.Scanner; import entities.Aluno; import entities.Professor;
 * 
 * public class SistemaAcademico { static Scanner sc = new Scanner(System.in);
 * 
 * private Aluno[] alunos; private Professor[] professores;
 * 
 * alunos=new Aluno[20];professores=new Professor[20];
 * 
 * void cadastrarAluno(Aluno a) { int i = alunos[]; alunos[i + 1] = a; }
 * 
 * void cadastrarProfessor(Professor p) { int i = professores.length;
 * professores[i + 1] = p; }
 * 
 * public static void main(String[] args) {
 * 
 * do { System.out.println("Escolha a opcao desejada:"); int opcao = 0; switch
 * (opcao) { case 1: String nome, endereco, telefone, curso; char sexo; int ra;
 * System.out.println("Cadastrar Aluno:"); System.out.println("Digite o RA"); ra
 * = sc.nextInt(); System.out.println("Digite o nome"); sc.next(); nome =
 * sc.nextLine(); System.out.println("Digite o curso"); curso = sc.nextLine();
 * System.out.println("Digite o endereço"); endereco = sc.nextLine();
 * System.out.println("Digite o telefone"); telefone = sc.nextLine();
 * System.out.println("Digite o Sexo (M/F)"); sexo = sc.next().charAt(0);
 * cadastrarAluno(new Aluno(nome, endereco, telefone, sexo, ra, curso)); break;
 * }
 * 
 * 
 * }
 * 
 * 
 * } }
 */