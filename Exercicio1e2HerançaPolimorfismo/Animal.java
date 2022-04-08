package Exercicio1e2HerançaPolimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("Som do Animal");
	}
	public void correr() {
		System.out.println("Corre Forrest Corre!");
	}
	public void subir() {
		System.out.println("Olha o Mamaco subindo nas árvores");
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
