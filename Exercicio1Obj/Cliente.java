package Exercicio1Obj;

public class Cliente {
	public static void main(String[] args) {
		ObjetoCliente cliente = new ObjetoCliente();
		
		cliente.cartaoDaLoja=true;
		cliente.preco=49.99;
		cliente.debito=39.99;
		cliente.dinheiro=50.00;
		
		cliente.status();
		cliente.pagar();
	}
}
