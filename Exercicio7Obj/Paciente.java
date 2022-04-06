package Exercicio7Obj;

public class Paciente {
	
	public static void main(String[] args) {
		ObjetoPaciente pac = new ObjetoPaciente();
		
		pac.nome = "Gabriel Duarte";
		pac.doenca = "Gripe";
		pac.sexo = false;
		pac.idade = 18;
		pac.peso = 61.00;
		
		pac.checarSexo();
		pac.informacaoPaciente();
	}
}
