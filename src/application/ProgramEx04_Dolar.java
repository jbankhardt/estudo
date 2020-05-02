package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConverterMoeda;

public class ProgramEx04_Dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dólar você quer comprar? ");
		double qtdade = sc.nextInt();
		System.out.printf("Valor pago em Reais: %.2f", ConverterMoeda.calculaConversao(dolar, qtdade));
		
		sc.close();
	}

}
