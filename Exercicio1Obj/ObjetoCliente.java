package Exercicio1Obj;

import java.util.Scanner;

public class ObjetoCliente {
	
	String nome;
	double dinheiro, debito, preco, pagamento;
	boolean cartaoDaLoja, credito, Y, y;
	
	Scanner ler = new Scanner(System.in);
	
	public void pagar()
	{
		if(cartaoDaLoja==true)
		{
			pagamento = preco*(10/100);
		}
		else if(debito>=preco)
		{
			pagamento = debito-preco;
		}
		else if(cartaoDaLoja==false)
		{
			System.out.println("Voc� deseja fazer o cart�o da loja?(Y/N)");
			
			if(Y==true || y==true)
			{
				cartaoDaLoja=true;
			}
			else
			{
				System.out.println("Compreens�vel tenha um �timo dia...");
			}
		}
		if(credito==true)
		{
			System.out.println("Pago no cr�dito...");
		}
		else if(debito>=preco)
		{
			pagamento = debito-preco;
		}
		else
		{
			pagamento = dinheiro-preco;
		}
		
	}
	public void status() {
		System.out.print("Nome: ");
		nome = ler.nextLine();
		System.out.println("O cliente tem o cart�o da loja? " + this.cartaoDaLoja);
		System.out.println("Quanto de dinheiro o cliente tem? " + String.format("%.2f", this.dinheiro));
		System.out.println("Quanto de dinheiro o cliente tem no debito? " + String.format("%.2f", this.debito));
		System.out.println("Pre�o do item que o cliente deseja comprar: " + String.format("%.2f", this.preco));
		System.out.println("Seu troco � de: " + String.format("%.2f", this.pagamento));
	}
}