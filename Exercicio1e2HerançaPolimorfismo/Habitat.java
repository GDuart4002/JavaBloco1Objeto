package Exercicio1e2HerançaPolimorfismo;

public class Habitat {
	
	public static void main(String[] args) {
		Cachorro doguin = new Cachorro();
		Cavalo juan = new Cavalo();
		Preguica sono = new Preguica();
		
		doguin.correr();
		doguin.emitirSom();
		juan.correr();
		juan.emitirSom();
		sono.subir();
		sono.emitirSom();
	}
}
