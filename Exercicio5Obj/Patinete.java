package Exercicio5Obj;

public class Patinete {
	public static void main(String[] args) {
		ObjetoPatinete patinete = new ObjetoPatinete();
		
		patinete.rodas = 4;
		patinete.anoFab = 1916;
		patinete.marca = "Charlie Brown Jr";
		patinete.estado = true;
		
		patinete.informacoesPatinete("Charlie Brown Jr", 4, 1916, true);
		patinete.andar();
	}
}