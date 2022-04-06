package Exercicio4Obj;

import java.util.*;

public class Funcionario {
	public static void main(String[] args) {
		
	
	ObjetoFuncionario funcionario = new ObjetoFuncionario();
	
	Scanner leia = new Scanner(System.in);
	
	funcionario.nome = "Gabriel Duarte";
	funcionario.ocupacao = "Quebrar códigos";
	funcionario.autorizacao = false;
	
	System.out.print("Você já faltou quantas vezes nesse mês? ");
	funcionario.faltas = leia.nextInt();
	funcionario.informacoesFunc();
	}
}


