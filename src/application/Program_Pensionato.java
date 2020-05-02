package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Inquilino;

public class Program_Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Inquilino[] quartos = new Inquilino[10];
		
		System.out.print("How many rooms will be rented? ");
		int qtdade = sc.nextInt();
		
		for (int i=1; i <= qtdade; i++) {
			System.out.println();
			System.out.printf("Rent #%d: \n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room] = new Inquilino(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.printf("%d: %s, %s\n", i, quartos[i].getName(), quartos[i].getEmail());
			}
		}
		
		sc.close();

	}

}
