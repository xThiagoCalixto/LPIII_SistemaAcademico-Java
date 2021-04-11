package entities;

public class Professor {
	private String nome, endereco, telefone;
	private char sexo;
	private int registro;
	private String materia;
	
	
	public Professor(String nome, String endereco, String telefone, char sexo, int registro, String materia) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
		this.registro = registro;
		this.materia = materia;
	}


	@Override
	public String toString() {
		return 
				  "\nNome: " + nome 
				+ "\nEndereco: " + endereco 
				+ "\nTelefone: " + telefone 
				+ "\nSexo: " + sexo 
				+ "\nRegistro: "+ registro 
				+ "\nMateria: " + materia;
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public char getSexo() {
		return sexo;
	}


	public int getRegistro() {
		return registro;
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


	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getMateria() {
		return materia;
	}
	
	
	
}
