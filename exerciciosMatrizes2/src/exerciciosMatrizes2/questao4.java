package exerciciosMatrizes2;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5], matrizCubo = new int[matriz.length][matriz[0].length];
		Scanner sc = new Scanner(System.in);

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha: ");
				matriz[ln][col] = sc.nextInt();

				matrizCubo[ln][col] = matriz[ln][col] * matriz[ln][col] * matriz[ln][col];
			}
		}

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print(matrizCubo[ln][col] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
