package entities;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaAcademico {
	String nome, endereco, telefone, materia, curso;
	char sexo;
	int registro, ra;
	Scanner sc = new Scanner(System.in);

	public static Aluno[] alunos;
	public Professor[] professores;

	public SistemaAcademico() {
		alunos = new Aluno[40];
		professores = new Professor[10];
	}

	public boolean cadastrarAluno(Aluno a) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = a;
				return true;
			}
		}
		return false;
	}

	public boolean cadastrarProfessor(Professor p) {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i] == null) {
				professores[i] = p;
				return true;
			}
		}
		return false;
	}

	public boolean removerProfessor(int registro) {
		for (int i = 0; i < professores.length; i++) {
			if ((professores[i] != null )&&(professores[i].getRegistro() == registro)) {
				for (int aux = i; aux < professores.length-1; aux++) {
					professores[aux] = professores[aux + 1];
				}
				professores[professores.length - 1] = null;
				return true;
			}
		}
		return false;
	}

	public boolean removerAluno(int ra) {
		for (int i = 0; i < alunos.length; i++) {
			if ((alunos[i] != null )&&(alunos[i].getRa() == ra)) {
				for (int aux = i; aux < alunos.length - 1; aux++) {
					alunos[aux] = alunos[aux + 1];
				}
				alunos[alunos.length - 1] = null;
				return true;
			}
		}
		return false;
	}

	public boolean alterarAluno(int ra) {

		for (int i = 0; i < alunos.length; i++) {
			if ((alunos[i] != null )&&(alunos[i].getRa() == ra)) {
				System.out.println("Alterar Aluno:");
				System.out.println("Digite o RA");
				alunos[i].setRa(sc.nextInt());
				System.out.println("Digite o nome");
				alunos[i].setNome(sc.nextLine());
				alunos[i].setNome(sc.nextLine());
				System.out.println("Digite o curso");
				alunos[i].setCurso(sc.nextLine());
				System.out.println("Digite o endereço");
				alunos[i].setEndereco(sc.nextLine());
				System.out.println("Digite o telefone");
				alunos[i].setTelefone(sc.nextLine());
				System.out.println("Digite o Sexo (M/F)");
				alunos[i].setSexo(sc.next().charAt(0));
				return true;
			}

		}
		return false;
	}

	public boolean alterarProfessor(int registro) {

		for (int i = 0; i < professores.length; i++) {
			if ((professores[i] != null )&&(professores[i].getRegistro() == registro)) {
				System.out.println("Alterar Professor:");
				System.out.println("Digite o registro");
				professores[i].setRegistro(sc.nextInt());
				System.out.println("Digite o nome");
				professores[i].setNome(sc.nextLine());
				professores[i].setNome(sc.nextLine());
				System.out.println("Digite a Materia");
				professores[i].setMateria(sc.nextLine());
				System.out.println("Digite o endereço");
				professores[i].setEndereco(sc.nextLine());
				System.out.println("Digite o telefone");
				professores[i].setTelefone(sc.nextLine());
				System.out.println("Digite o Sexo (M/F)");
				professores[i].setSexo(sc.next().charAt(0));
				return true;
			}

		}
		return false;
	}

	public boolean pesquisarAluno(int ra) {
		for (int i = 0; i < alunos.length; i++) {
			if ((alunos[i] != null )&&(alunos[i].getRa() == ra)) {
				System.out.println(alunos[i]);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "SistemaAcademico [alunos=" + Arrays.toString(alunos) + "]";
	}

	public void listarAlunos() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				System.out.println(alunos[i]);
			}

		}
	}
	
	public void listarProfessores() {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i] != null) {
				System.out.println(professores[i]);
			}

		}
	}

}