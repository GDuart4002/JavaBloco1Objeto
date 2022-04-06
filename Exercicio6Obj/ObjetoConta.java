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
			System.out.println("Esta é uma conta corrente.");
			
		}
		else
		{
			System.out.println("Esta é uma conta poupança.");
			
		}
	}
	
	public void sacar()
	{
		if(saldo<=0)
		{
			System.out.println("Saía daqui seu PLEBEU!!!");
		}
		else
		{
		System.out.println("Quanto você quer sacar: ");
		s = ler.nextDouble();
		saldo -= s;
		}
	}
	
	public void depositar()
	{
		System.out.println("Quanto você quer depositar? ");
		d = ler.nextDouble();
		saldo += d;
	}
	
	public void checkDeConta()
	{
		System.out.println("A agência é: "+this.agencia);
		System.out.println("O dono da conta é: "+this.dono);
		System.out.println("O tipo da conta é corrente? "+this.tipoConta);
		System.out.println("Saldo da conta: "+ String.format("%.3f", this.saldo));
		System.out.println("Limite diário: "+ String.format("%.3f", this.saldo));
	}
}
