package exerciciosMatrizes3;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {

		int[][] matriz;
		int linhas, colunas, valor;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz: ");
		linhas = sc.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		colunas = sc.nextInt();
		System.out.print("Digite um valor qualquer: ");
		valor = sc.nextInt();

		matriz = new int[linhas][colunas];

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
				} else if (matriz.length % 2 == 0 && matriz[0].length % 2 == 0) {
					if ((ln == (matriz.length / 2) || ln == (matriz.length / 2 - 1))
							&& ((col == (matriz[0].length / 2)) || col == (matriz[0].length / 2 - 1))
							&& matriz.length > 2 && matriz[0].length > 2) {
						System.out.print(matriz[ln][col] + " ");
					} else {
						System.out.print("  ");
					}
				} else if (matriz.length % 2 == 0 && matriz[0].length % 2 != 0) {
					if ((ln == (matriz.length / 2) || ln == (matriz.length / 2 - 1))
							&& (col == ((matriz[0].length - 1) / 2)) && matriz.length > 2 && matriz[0].length > 2) {
						System.out.print(matriz[ln][col] + " ");
					} else {
						System.out.print("  ");
					}
				} else if (matriz.length % 2 != 0 && matriz[0].length % 2 == 0) {
					if ((ln == ((matriz.length - 1) / 2))
							&& (col == (matriz[0].length / 2) || col == (matriz[0].length / 2 - 1)) && matriz.length > 2
							&& matriz[0].length > 2) {
						System.out.print(matriz[ln][col] + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					if ((ln == ((matriz.length - 1) / 2)) && (col == ((matriz[0].length - 1) / 2)) && matriz.length > 2
							&& matriz[0].length > 2) {
						System.out.print(matriz[ln][col] + " ");
					} else {
						System.out.print("  ");
					}
				}

			}
			System.out.println();
		}

		sc.close();

	}

}
