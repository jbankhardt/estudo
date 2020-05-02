package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramEx03_Aluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno;
		aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f\n", aluno.somaNotas());
		aluno.verificaMedia();
		
		sc.close();

	}

}
