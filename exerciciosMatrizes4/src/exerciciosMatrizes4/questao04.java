package exerciciosMatrizes4;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		int num;
		String[][] desenho;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		num = sc.nextInt();

		desenho = new String[num * 2 + 1][num * 4 + 1];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == (desenho.length - 1) / 2 || col == (desenho[0].length - 1) / 2) {
					desenho[ln][col] = "*";
				}
			}
		}

		// Esquerda Cima
		for (int ln = 0; ln < desenho.length / 2; ln++) {
			int contador = ln + 1;
			for (int col = (desenho[0].length - 2) / 2; col >= 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (ln + 1);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		// Direita Cima
		for (int ln = 0; ln < desenho.length / 2; ln++) {
			int contador = ln + 1;
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (ln + 1);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		// Esquerda Baixo
		for (int ln = desenho.length - 1; ln > (desenho.length - 1) / 2; ln--) {
			int contador = (desenho.length - ln);
			for (int col = (desenho[0].length - 2) / 2; col >= 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (desenho.length - ln);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		// Direita Baixo
		for (int ln = desenho.length - 1; ln > (desenho.length - 1) / 2; ln--) {
			int contador = (desenho.length - ln);
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (desenho.length - ln);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				System.out.print(desenho[ln][col]);
			}
			System.out.println();
		}

		sc.close();

	}

}
