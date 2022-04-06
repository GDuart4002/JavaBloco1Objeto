package Exercicio3Obj;

public class Eletronico {

	public static void main(String[] args) {
		ObjetoEletronico produto = new ObjetoEletronico();
		
		produto.nome = "Compacta Print";
		produto.anoFab = 2022;
		produto.porte = true;
		produto.avaliacao = "10/10";
		
		produto.informacoesProd();
	}

}
