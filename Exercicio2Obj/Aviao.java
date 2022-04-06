package Exercicio2Obj;

public class Aviao {

	public static void main(String[] args) {
		ObjetoAviao aviao = new ObjetoAviao();
		
		aviao.anosConstruido = 50;
		aviao.uso = "Civil";
		aviao.marca = "123Milhas";
		aviao.atividade = true;
		aviao.manutencao = false;
		
		aviao.estadoAviao();
	}

}
