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
			System.out.println("\nEscolha a opcao" 
					+ "\n 1- Cadastrar Aluno" 
					+ "\n 2- Cadastrar Professor"
					+ "\n 3- Excluir Aluno" 
					+ "\n 4- Excluir Professor" 
					+ "\n 5- Alterar Aluno" 
					+ "\n 6- Alterar Professor"
					+ "\n 7- Pesquisar Aluno" 
					+ "\n 8- Pesquisar Professor"
					+ "\n 9- Listar Alunos"
					+ "\n10 - Listar Professores"
					+ "\n11- Sair\n");
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
				nome = sc.nextLine();
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
				if(sa.cadastrarAluno(a)) {
					System.out.println("Aluno Cadastrado com sucesso");
				}else {
					System.out.println("Nao foi possivel cadastrar o aluno");
				};break;

			case 2:
				System.out.println("Cadastrar Professor:");
				System.out.println("Digite o Registro");
				registro = sc.nextInt();
				System.out.println("Digite o nome");
				nome = sc.nextLine();
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
				if(sa.cadastrarProfessor(p)) {
					System.out.println("Professor Cadastrado com sucesso");
				}else {
					System.out.println("Nao foi possivel cadastrar o professor");
				};break;

			case 3:
				System.out.println("Digite o RA do aluno a ser excluido");
				ra = sc.nextInt();
				if(sa.removerAluno(ra)) {
					System.out.println("Aluno removido com sucesso");
				}else {
					System.out.println("Nao foi possivel localizar o aluno - Exclusao nao efetuada");
				};break;

			case 4:
				//Excluir Professor
				System.out.println("Digite o registro do professor a ser excluido");
				registro = sc.nextInt();
				if(sa.removerProfessor(registro)) {
					System.out.println("Professor removido com sucesso");
				}else {
					System.out.println("Nao foi possivel localizar o professor - Exclusao nao efetuada");
				};break;

			case 5:
				//Alterar Aluno
				System.out.println("Digite o RA do aluno a ser alterado");
				ra = sc.nextInt();
				if(sa.alterarAluno(ra)) {
					System.out.println("Aluno alterado com sucesso");
				}else {
					System.out.println("Nao foi possivel localizar o aluno - Alteracao nao efetuada");
				};break;

			case 6:
				//Alterar Professor
				System.out.println("Digite o registro do professor a ser alterado");
				registro = sc.nextInt();
				if(sa.alterarProfessor(registro)) {
					System.out.println("Professor alterado com sucesso");
				}else {
					System.out.println("Nao foi possivel localizar o professor - Alteracao nao efetuada");
				};break;
			
			case 7:
				//Pesquisar Aluno
				System.out.println("Digite o RA do aluno para pesquisa");
				ra = sc.nextInt();
				if(!sa.pesquisarAluno(ra)){
					System.out.println("Aluno nao localizado");
				};break;
			
			case 8:
				//Pesquisar Professor
				System.out.println("Digite o registro do professor a ser excluido");
				registro = sc.nextInt();
				if(!sa.removerProfessor(registro)) {
					System.out.println("Professor nao localizado");
				};
				break;
			
			case 9:
				//Listar Alunos
				sa.listarAlunos();
			break;
			
			case 10:
			//Listar Professores
			sa.listarProfessores();
			break;

		}
		
	} while (opcao < 11);
	System.out.println("\n * * * Sistema Fechado * * *");
	}
}
