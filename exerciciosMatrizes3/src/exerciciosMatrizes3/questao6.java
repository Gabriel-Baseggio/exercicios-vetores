package exerciciosMatrizes3;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		int valor;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor qualquer: ");
		valor = sc.nextInt();
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				matriz[ln][col] = valor;

				if (ln == 0 && col == 0) {
					System.out.print(matriz[ln][col] + " ");
				} else if (ln == 0 && col == matriz[0].length - 1) {
					System.out.print(matriz[ln][col] + " ");
				} else if (ln == matriz.length - 1 && col == 0) {
					System.out.print(matriz[ln][col] + " ");
				} else if (ln == matriz.length - 1 && col == matriz[0].length - 1) {
					System.out.print(matriz[ln][col] + " ");
				} else if (ln == ((matriz.length - 1) / 2) && col == ((matriz[0].length - 1) / 2)) {
					System.out.print(matriz[ln][col] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
