package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramEx01_Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangulo = new Retangle();
		
		System.out.println("Entre com a largura e a altura do Triângulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();

	}

}
