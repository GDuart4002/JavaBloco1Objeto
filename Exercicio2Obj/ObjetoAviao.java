package Exercicio2Obj;

public class ObjetoAviao {
	
	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("O avi�o ir� decolar.");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("O avi�o est� pousando.");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("O avi�o est� na rota.");
		}
		else {
			System.out.println("O avi�o est� pronto para decolar.");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("Manuten��o em dia.");
		}
		else {
			System.out.println("Precisa de reparos.");
		}
	}
	public void desgastar() {
		boolean manutencao = false;
	}
	public void revitalizar() {
		boolean manutencao = true;
	}
	public void estadoAviao() {
		System.out.println("O avi�o foi constru�do em " + this.anosConstruido + " anos atr�s");
		System.out.println("O avi�o � de uso " + this.uso);
		System.out.println("A marca do avi�o �: " + this.marca);
		System.out.println("Avi�o est� operando? " + this.atividade);
		System.out.println("O avi�o precisa de manuten��o? " + this.manutencao);
	}
}
