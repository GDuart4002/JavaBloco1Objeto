package Exercicio6Obj;

import java.util.*;

public class ObjetoConta {
	
	String agencia, dono;
	double limite, saldo;
	boolean tipoConta;
	double s, d;
	
	Scanner ler = new Scanner(System.in);
	
	public void checkTipoConta()
	{
		if(tipoConta == true)
		{
			System.out.println("Esta � uma conta corrente.");
			
		}
		else
		{
			System.out.println("Esta � uma conta poupan�a.");
			
		}
	}
	
	public void sacar()
	{
		if(saldo<=0)
		{
			System.out.println("Sa�a daqui seu PLEBEU!!!");
		}
		else
		{
		System.out.println("Quanto voc� quer sacar: ");
		s = ler.nextDouble();
		saldo -= s;
		}
	}
	
	public void depositar()
	{
		System.out.println("Quanto voc� quer depositar? ");
		d = ler.nextDouble();
		saldo += d;
	}
	
	public void checkDeConta()
	{
		System.out.println("A ag�ncia �: "+this.agencia);
		System.out.println("O dono da conta �: "+this.dono);
		System.out.println("O tipo da conta � corrente? "+this.tipoConta);
		System.out.println("Saldo da conta: "+ String.format("%.3f", this.saldo));
		System.out.println("Limite di�rio: "+ String.format("%.3f", this.saldo));
	}
}
