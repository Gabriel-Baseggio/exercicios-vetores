package jogoDaVelha;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] args) {

		String[][] jogo = new String[3][3];
		String ganhador = "", jogador = "";
		int rodada = 0, posJogada;
		Scanner sc = new Scanner(System.in);

		while (ganhador == "") {
			rodada++;
			System.out.println("\nDesenhando o jogo: ");

			int aux = 0;
			for (int ln = 0; ln < jogo.length; ln++) {
				for (int col = 0; col < jogo[0].length; col++) {
					if (jogo[ln][col] == null || jogo[ln][col].equals(" ")) {
						jogo[ln][col] = (aux + 1) + "";
					}
					System.out.print(" " + jogo[ln][col] + " ");
					if (col != 2) {
						System.out.print("|");
					}
					if (ln != 2 && col == 2) {
						System.out.print("\n= = = = = =");
					}
					aux++;
				}
				System.out.println();
			}

			System.out.println("Rodada: " + rodada);

			if (rodada % 2 == 0) {
				jogador = "O";
			} else {
				jogador = "X";
			}

			System.out.println("Vez do jogador: " + jogador);

			System.out.print("Onde você gostaria de jogar?(número da posição) \n-> ");
			posJogada = sc.nextInt();

			if (posJogada == 1 && !((jogo[0][0].equals("X")) || (jogo[0][0].equals("O")))) {
				jogo[0][0] = jogador;
			} else if (posJogada == 2 && !((jogo[0][1].equals("X")) || (jogo[0][1].equals("O")))) {
				jogo[0][1] = jogador;
			} else if (posJogada == 3 && !((jogo[0][2].equals("X")) || (jogo[0][2].equals("O")))) {
				jogo[0][2] = jogador;
			} else if (posJogada == 4 && !((jogo[1][0].equals("X")) || (jogo[1][0].equals("O")))) {
				jogo[1][0] = jogador;
			} else if (posJogada == 5 && !((jogo[1][1].equals("X")) || (jogo[1][1].equals("O")))) {
				jogo[1][1] = jogador;
			} else if (posJogada == 6 && !((jogo[1][2].equals("X")) || (jogo[1][2].equals("O")))) {
				jogo[1][2] = jogador;
			} else if (posJogada == 7 && !((jogo[2][0].equals("X")) || (jogo[2][0].equals("O")))) {
				jogo[2][0] = jogador;
			} else if (posJogada == 8 && !((jogo[2][1].equals("X")) || (jogo[2][1].equals("O")))) {
				jogo[2][1] = jogador;
			} else if (posJogada == 9 && !((jogo[2][2].equals("X")) || (jogo[2][2].equals("O")))) {
				jogo[2][2] = jogador;
			} else {
				System.out.println("Posição já ocupada, reiniciando a rodada!");
				rodada--;
			}

			for (int pos = 0; pos < 3; pos++) {
				if (jogo[pos][0] == jogo[pos][1] && jogo[pos][0] == jogo[pos][2] && ((jogo[pos][0].equals("X")) || (jogo[pos][0].equals("O")))) {
					ganhador = jogador;
				}
				if (jogo[0][pos] == jogo[1][pos] && jogo[0][pos] == jogo[2][pos] && ((jogo[0][pos].equals("X")) || (jogo[0][pos].equals("O")))) {
					ganhador = jogador;
				}
			}
			if (jogo[0][0] == jogo[1][1] && jogo[0][0] == jogo[2][2] && ((jogo[0][0].equals("X")) || (jogo[0][0].equals("O")))) {
				ganhador = jogador;
			}

			if (jogo[0][2] == jogo[1][1] && jogo[0][2] == jogo[2][0] && ((jogo[0][2].equals("X")) || (jogo[0][2].equals("O")))) {
				ganhador = jogador;
			}

		}

		System.out.println("\nDesenhando o jogo: ");

		for (int ln = 0; ln < jogo.length; ln++) {
			for (int col = 0; col < jogo[0].length; col++) {
				if (jogo[ln][col] == null || jogo[ln][col].equals(" ")) {
					jogo[ln][col] = " ";
				}
				System.out.print(jogo[ln][col] + " ");
				if (col != 2) {
					System.out.print("| ");
				}
				if (ln != 2 && col == 2) {
					System.out.print("\n= = = = =");
				}
			}
			System.out.println();
		}

		System.out.println("Ganhador: " + ganhador);

		sc.close();

	}

}
