package Exercicio4Obj;

import java.util.*;

public class Funcionario {
	public static void main(String[] args) {
		
	
	ObjetoFuncionario funcionario = new ObjetoFuncionario();
	
	Scanner leia = new Scanner(System.in);
	
	funcionario.nome = "Gabriel Duarte";
	funcionario.ocupacao = "Quebrar c�digos";
	funcionario.autorizacao = false;
	
	System.out.print("Voc� j� faltou quantas vezes nesse m�s? ");
	funcionario.faltas = leia.nextInt();
	funcionario.informacoesFunc();
	}
}


