package Exercicio4Obj;

public class ObjetoFuncionario {
	
	String nome, ocupacao;
	boolean autorizacao;
	int faltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcion�rio: " + this.nome);
		System.out.println("Ocupa��o do funcion�rio: " + this.ocupacao);
		System.out.print("Voc� tem permiss�o de estar nessa sala? " + this.autorizacao);
		
		if (autorizacao == false) {
			System.out.println("Voc� n�o deveria estar aqui!!!");
		}
		
		System.out.print("Voc� j� faltou quantas vezes nesse m�s? " + this.faltas);
		
		if (faltas >= 10) {
			System.out.println("Voc� est� querendo ser demitido por acaso?");
		}
		else if (faltas > 0 && faltas < 10) {
			System.out.println("� um n�mero razo�vel eu diria");
		}
		else {
			System.out.println("Voc� provavelmente ama esse emprego ou o dinheiro!!!");
		}
	}
}
