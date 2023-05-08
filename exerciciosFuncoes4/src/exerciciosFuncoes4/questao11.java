package exerciciosFuncoes4;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		desenhar(num);

		sc.close();

	}

	static void desenhar(int num) {
		String[][] desenho = new String[num + 2][num * 4 + 5];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == 0 || ln == desenho.length - 1) {
					if (col == 0 || col == desenho[0].length - 1) {
						desenho[ln][col] = "*";
					} else {
						desenho[ln][col] = "=";
					}
				} else if (col == 0 || col == ((desenho[0].length - 1) / 2) || col == desenho[0].length - 1) {
					desenho[ln][col] = "*";
				}
			}
		}

		for (int ln = 1; ln < desenho.length - 1; ln++) {
			int contador = ln;
			for (int col = 1; col < (desenho[0].length - 1) / 2; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (col / 2);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 2; ln > 0; ln--) {
			int contador = desenho.length - 1 - ln;
			for (int col = desenho[0].length - 2; col > (desenho[0].length - 1) / 2; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho[0].length - 1 - col) / 2);
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
