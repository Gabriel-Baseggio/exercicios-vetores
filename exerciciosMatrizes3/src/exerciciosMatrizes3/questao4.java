package exerciciosMatrizes3;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Scanner sc = new Scanner(System.in);

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha da matriz: ");
				matriz[ln][col] = sc.nextInt();

				if (matriz[ln][col] < 0) {
					matriz[ln][col] = 0;
				}
			}
		}

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print(matriz[ln][col] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
