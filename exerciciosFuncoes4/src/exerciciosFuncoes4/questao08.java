package exerciciosFuncoes4;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero: ");
		int num = sc.nextInt();

		desenhar(num);

		sc.close();

	}

	static void desenhar(int num) {
		String[][] desenho = new String[num + 3][num * 4 + 5];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == 0 || ln == desenho.length - 1) {
					if (col == 0 || col == desenho[0].length - 1) {
						desenho[ln][col] = "*";
					} else if (ln == 0) {
						desenho[ln][col] = "=";
					} else {
						desenho[ln][col] = "-";
					}
				} else if (col == 0 || col == desenho[0].length - 1) {
					desenho[ln][col] = "*";
				} else if (col == (desenho[0].length - 1) / 2) {
					desenho[ln][col] = "*";
				} else if (ln == desenho.length - 2) {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 3; ln > 0; ln--) {
			int contador = ((desenho.length - 2) - ln);
			for (int col = (desenho[0].length - 2) / 2; col > 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho.length - 2) - ln);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 3; ln > 0; ln--) {
			int contador = ((desenho.length - 2) - ln);
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length - 1; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho.length - 2) - ln);
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
	}

}
