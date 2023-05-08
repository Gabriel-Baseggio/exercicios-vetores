package exerciciosFuncoes4;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		desenhar(num);
		
		sc.close();

	}

	static void desenhar(int num) {
		String[][] desenho = new String[num * 2 + 3][num * 2 + 3];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == 0 || ln == desenho.length - 1) {
					if (col == 0 || col == desenho[0].length - 1) {
						desenho[ln][col] = "*";
					} else {
						desenho[ln][col] = "=";
					}
				} else if (col == 0 || col == desenho[0].length - 1) {
					desenho[ln][col] = "*";
				} else if (ln == (desenho.length - 1) / 2) {
					desenho[ln][col] = "*";
				}
			}
		}

		for (int ln = 1; ln < (desenho.length - 1) / 2; ln++) {
			int contador = ln;
			for (int col = desenho[0].length - 2; col > 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ln;
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 2; ln > desenho.length / 2; ln--) {
			int contador = ((desenho.length - 1) - ln);
			for (int col = 1; col < desenho[0].length - 1; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho.length - 1) - ln);
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
