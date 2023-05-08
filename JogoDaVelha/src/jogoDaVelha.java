import java.util.Random;
import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] argumentos) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String[][] jogo = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		int rodada = 0;
		String jogador = "X";

		while (!checarVencedor(jogo)) {
			rodada++;
			if (rodada % 2 != 0) {
				jogador = "X";
			} else {
				jogador = "O";
			}

			System.out.println();
			desenharJogo(jogo);

			System.out.println("\nJogador " + jogador);
			
			int linha = 1, coluna = 1;
			
			if (jogador.equals("X")) {
				System.out.print("Linha: ");
				linha = (sc.nextInt()) - 1;
				System.out.print("Coluna: ");
				coluna = (sc.nextInt()) - 1;				
			} else {
				do {
					linha = random.nextInt(2);
					coluna = random.nextInt(2);					
				} while (!checarJogada(linha, coluna, jogo));
			}

			if (!checarJogada(linha, coluna, jogo)) {
				System.out.println("Jogada inválida! Jogue novamente");
				rodada--;
			} else {
				jogo[linha][coluna] = jogador;
			}

			checarVencedor(jogo);
		}
		desenharJogo(jogo);
		System.out.println("\n-----------\nVencedor: " + jogador);
		sc.close();
	}

	static void desenharJogo(String[][] jogo) {
		for (int ln = 0; ln < jogo.length; ln++) {
			for (int col = 0; col < jogo[0].length; col++) {
				System.out.print(" " + jogo[ln][col] + " ");
				if (col < 2) {
					System.out.print("|");
				}
			}
			if (ln < 2) {
				System.out.println("\n===========");
			}
		}
	}

	static boolean checarVencedor(String[][] jogo) {
		for (int ln = 0; ln < jogo.length; ln++) {
			if ((jogo[ln][0] == jogo[ln][1]) && (jogo[ln][0] == jogo[ln][2]) && jogo[ln][0] != " ") {
				return true;
			}
		}
		for (int col = 0; col < jogo[0].length; col++) {
			if ((jogo[0][col] == jogo[1][col]) && (jogo[0][col] == jogo[2][col]) && (jogo[0][col] != " ")) {
				return true;
			}
		}
		if ((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]) && (jogo[0][0] != " ")) {
			return true;
		}
		if ((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0]) && (jogo[0][2] != " ")) {
			return true;
		}

		return false;
	}

	static boolean checarJogada(int linha, int coluna, String[][] jogo) {
		if ((linha < 0) || (linha > 2)) {
			return false;
		}
		if ((coluna < 0) || (coluna > 2)) {
			return false;
		}
		if (jogo[linha][coluna] != " ") {
			return false;
		}

		return true;
	}

}