package Exercicio2Obj;

public class ObjetoAviao {
	
	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("O avião irá decolar.");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("O avião está pousando.");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("O avião está na rota.");
		}
		else {
			System.out.println("O avião está pronto para decolar.");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("Manutenção em dia.");
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
		System.out.println("O avião foi construído em " + this.anosConstruido + " anos atrás");
		System.out.println("O avião é de uso " + this.uso);
		System.out.println("A marca do avião é: " + this.marca);
		System.out.println("Avião está operando? " + this.atividade);
		System.out.println("O avião precisa de manutenção? " + this.manutencao);
	}
}
