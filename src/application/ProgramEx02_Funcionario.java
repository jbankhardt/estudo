package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramEx02_Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		//System.out.printf("Funcionário: %s, $ %.2f\n\n", funcionario.nome, funcionario.salarioLiquido());
		System.out.println("Funcionário: " + funcionario);
		
		System.out.println();
		System.out.print("Qual porcentagem aumentar o salario? ");
		double p = sc.nextDouble();
		funcionario.aumentarSalario(p);
		
		System.out.println();
		//System.out.printf("Atualização dos dados: %s, $ %.2f\n\n", funcionario.nome, funcionario.salarioLiquido());
		System.out.println("Atualização dos dados: " + funcionario);
		
		sc.close();
	}

}
