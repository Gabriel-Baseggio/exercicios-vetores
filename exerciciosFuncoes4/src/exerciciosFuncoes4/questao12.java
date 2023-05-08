package exerciciosFuncoes4;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		desenhar(num);

		sc.close();

	}

	static void desenhar(int num) {
		String[][] desenho;

		if (num % 2 == 0) {
			desenho = new String[num / 2 + 1][num * 2 - 1];

			for (int ln = 0; ln < desenho.length; ln++) {
				for (int col = 0; col < desenho[0].length; col++) {
					if (col % 2 == 0 && ln != desenho.length - 1) {
						desenho[ln][col] = "" + (ln * 2 + 2);
					} else {
						desenho[ln][col] = " ";
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2 + 1);
				for (int col = 0; col < (desenho[0].length - 1) / 2; col++) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2 + 1);
				for (int col = desenho[0].length - 1; col > (desenho[0].length + 1) / 2; col--) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}
		} else {
			desenho = new String[((num + 1) / 2) + 1][num * 2 - 1];

			for (int ln = 0; ln < desenho.length; ln++) {
				for (int col = 0; col < desenho[0].length; col++) {
					if (col % 2 == 0 && ln != desenho.length - 1) {
						desenho[ln][col] = "" + (ln * 2 + 1);
					} else {
						desenho[ln][col] = " ";
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2);
				for (int col = 0; col < (desenho[0].length - 1) / 2; col++) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2);
				for (int col = desenho[0].length - 1; col > (desenho[0].length + 1) / 2; col--) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}
		}

		for (int col = 0; col < desenho[0].length; col++) {
			desenho[desenho.length - 1][col] = "=";
		}

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				System.out.print(desenho[ln][col]);
			}
			System.out.println();
		}
	}

}
