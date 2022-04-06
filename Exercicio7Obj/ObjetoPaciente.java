package Exercicio7Obj;

public class ObjetoPaciente {
	
	String nome, doenca;
	boolean sexo;
	int idade;
	double peso;
	
	public void checarSexo() {
		if (sexo == true) {
			System.out.println("O paciente é do sexo feminino.");
		}
		else {
			System.out.println("O paciente é do sexo masculino.");

		}
	}
	
	public void informacaoPaciente() {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Motivo da consulta: " + this.doenca);
		System.out.println("O paciente é do sexo feminino? " + this.sexo);
		System.out.println("A idade do paciente: " + this.idade);
		System.out.println("Peso do paciente: " + String.format("%.2f", this.peso));
	}
}
