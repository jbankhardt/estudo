package application;

import java.util.Scanner;

public class Program_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		int matriz[][] = new int[linhas][colunas];

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		boolean temx = false;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] == x) {
					System.out.println();
					System.out.println("Position " + l + "," + c);
					if (c - 1 >= 0) {
						System.out.println("Left: " + matriz[l][c - 1]);
					}
					if (l - 1 >= 0) {
						System.out.println("Up: " + matriz[l - 1][c]);
					}
					if (c + 1 < matriz.length) {
						System.out.println("Right: " + matriz[l][c + 1]);
					}
					if (l + 1 < matriz[l].length) {
						System.out.println("Down: " + matriz[l + 1][c]);
					}
					temx = true;
				}
			}
		}

		if (!temx) {
			System.out.println("O número procurado não está na matriz.");
		}
		sc.close();
	}

}
