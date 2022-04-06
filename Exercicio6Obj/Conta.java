package Exercicio6Obj;

import java.util.*;

public class Conta {

	public static void main(String[] args) {
		ObjetoConta conta = new ObjetoConta();
		
		Scanner leia = new Scanner(System.in);
		
		conta.agencia = "PicPay";
		conta.dono = "Gabriel Duarte";
		conta.tipoConta = true;
		
		System.out.print("Primeiramente, informe-nos seu saldo atual: ");
		conta.saldo = leia.nextDouble();
		
		conta.depositar();
		
		conta.sacar();
		
		conta.limite = conta.saldo * 0.20;
		
		conta.checkDeConta();
	}

}