package Exercicio5Obj;

public class ObjetoPatinete {
	
	String marca;
	int rodas, anoFab;
	boolean estado;
	
	public void quebrar() {
		boolean estado = false;
	}
	
	public void consertar() {
		boolean estado = true;
	}
	
	public void andar() {
		if (estado == false) {
			System.out.println("Está quebrado");
		}
		else {
			System.out.println("Está em perfeitas condições");
		}
	}
	public void informacoesPatinete(String marca, int rodas, int anoFab, boolean estado)
	{
		System.out.println("O patinete tem " + this.rodas + " rodas.");
		System.out.println("O patinete foi fabricado no ano de: " + this.anoFab);
		System.out.println("É da marca: " + this.marca);
		System.out.println("O patinete está em boas condições? " + this.estado);
		
		if (estado == false) {
			System.out.println("Está quebrado");
		}
		else {
			System.out.println("Está em perfeitas condições");
		}
	}
}
