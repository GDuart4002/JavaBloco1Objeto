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
			System.out.println("O produto � grande");
		}
		else {
			System.out.println("O produto � pequeno");
		}
	}
	
	public void informacoesProd() {
		System.out.println("O nome do produto �: " + this.nome);
		System.out.println("Seu ano de fabrica��o �: " + this.anoFab);
		System.out.println("� um produto de porte grande? " + this.porte);
		System.out.println("A nota do produto �: " + this.avaliacao);
	}
}
