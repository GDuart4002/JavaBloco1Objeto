package Exercicio1e2Heran�aPolimorfismo;

public class Animal {

	private String nome;
	private int idade;
	private boolean som;
	
	public void emitirSom() {
		System.out.println("Emitindo som caracter�stico...");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
