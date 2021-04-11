package entities;

import java.util.Scanner;

public class Aluno {
	private String nome, endereco, telefone;
	private char sexo;
	private int ra;
	private String curso;

	static Scanner sc = new Scanner(System.in);

	public Aluno(String nome, String endereco, String telefone, char sexo, int ra, String curso) {

		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
		this.ra = ra;
		this.curso = curso;
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public void setRa(int ra) {
		this.ra = ra;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public static void setSc(Scanner sc) {
		Aluno.sc = sc;
	}


	public String getTelefone() {
		return telefone;
	}


	public char getSexo() {
		return sexo;
	}


	public int getRa() {
		return ra;
	}


	public String getCurso() {
		return curso;
	}


	public static Scanner getSc() {
		return sc;
	}


	@Override
	public String toString() {
		return "Dados do Aluno "
				+ "\nNome:" + nome 
				+ "\nEndereco=" + endereco 
				+ "\nTelefone=" + telefone 
				+ "\nSexo=" + sexo 
				+ "\nRA="+ ra 
				+ "\nCurso=" + curso;
	}

}
