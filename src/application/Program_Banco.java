package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program_Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int n = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String t = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char p = sc.next().charAt(0);
		while (p != 'y' && p != 'Y' && p != 'n' && p != 'N') {
			System.out.print("Opção inválida. Digite somente y ou n. ");
			p = sc.next().charAt(0);
		}
		
		System.out.println();
		Conta conta;
		if (p == 'y' || p == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double d = sc.nextDouble();
			conta = new Conta(n, t, d);
		} else {
			conta = new Conta(n, t);
		} 
		
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		conta.saca(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
