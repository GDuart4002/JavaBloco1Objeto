package Exercicio3Obj;

public class ObjetoEletronico {
	
	String nome, avaliacao;
	int anoFab;
	boolean porte;
	
	public void porteGrande() {
		boolean porte = true;
	}
	
	public void portePequeno() {
		boolean porte = false;
	}
	
	public void checarPorte() {
		if (porte = true) {
			System.out.println("O produto é grande");
		}
		else {
			System.out.println("O produto é pequeno");
		}
	}
	
	public void informacoesProd() {
		System.out.println("O nome do produto é: " + this.nome);
		System.out.println("Seu ano de fabricação é: " + this.anoFab);
		System.out.println("É um produto de porte grande? " + this.porte);
		System.out.println("A nota do produto é: " + this.avaliacao);
	}
}
