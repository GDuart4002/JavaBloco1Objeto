package Exercicio4Obj;

public class ObjetoFuncionario {
	
	String nome, ocupacao;
	boolean autorizacao;
	int faltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcionário: " + this.nome);
		System.out.println("Ocupação do funcionário: " + this.ocupacao);
		System.out.print("Você tem permissão de estar nessa sala? " + this.autorizacao);
		
		if (autorizacao == false) {
			System.out.println("Você não deveria estar aqui!!!");
		}
		
		System.out.print("Você já faltou quantas vezes nesse mês? " + this.faltas);
		
		if (faltas >= 10) {
			System.out.println("Você está querendo ser demitido por acaso?");
		}
		else if (faltas > 0 && faltas < 10) {
			System.out.println("É um número razoável eu diria");
		}
		else {
			System.out.println("Você provavelmente ama esse emprego ou o dinheiro!!!");
		}
	}
}
