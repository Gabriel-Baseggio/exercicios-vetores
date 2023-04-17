import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {

		int[][] jogo = new int[9][9];
		int num;
		boolean certo = true;
		int[] quantidades = new int[9];
		Scanner sc = new Scanner(System.in);

		for (int ln = 0; ln < jogo.length; ln++) {
			for (int col = 0; col < jogo[0].length; col++) {
				System.out.println("Desenhando o jogo: \n");

				System.out.println("    1 2 3   4 5 6   7 8 9");
				System.out.println("    | | |   | | |   | | |");
				for (int desLn = 0; desLn < jogo.length; desLn++) {
					for (int desCol = 0; desCol < jogo[0].length; desCol++) {
						if (desCol == 0) {
							if (jogo[desLn][desCol] == 0) {
								System.out.print((desLn + 1) + " - X ");								
							} else {								
								System.out.print((desLn + 1) + " - " + jogo[desLn][desCol] + " ");
							}
						} else if (desCol == 2 || desCol == 5) {
							if (jogo[desLn][desCol] == 0) {
								System.out.print("X | ");								
							} else {								
								System.out.print(jogo[desLn][desCol] + " | ");
							}
						} else {
							if (jogo[desLn][desCol] == 0) {
								System.out.print("X ");								
							} else {								
								System.out.print(jogo[desLn][desCol] + " ");
							}
						}
					}
					System.out.println();
					if (desLn == 2 || desLn == 5) {
						System.out.println("    =====================");
					}
				}

				System.out.print("\nDigite o número a ser jogado(1 - 9) na linha " + (ln + 1) + " coluna " + (col + 1) + ": ");
				num = sc.nextInt();

				if (num > 0 && num < 10) {
					jogo[ln][col] = num;
				} else {
					System.out.println("Número inválido, deve ser entre 1 a 9!");
					col--;
				}
			}

		}

		for (int ln = 0; ln < jogo.length; ln++) {
			for (int col = 0; col < jogo[0].length; col++) {
				if (jogo[ln][col] == 1 && quantidades[0] == 0) {
					quantidades[0]++;
				} else if (jogo[ln][col] == 2 && quantidades[1] == 0) {
					quantidades[1]++;
				} else if (jogo[ln][col] == 3 && quantidades[2] == 0) {
					quantidades[2]++;
				} else if (jogo[ln][col] == 4 && quantidades[3] == 0) {
					quantidades[3]++;
				} else if (jogo[ln][col] == 5 && quantidades[4] == 0) {
					quantidades[4]++;
				} else if (jogo[ln][col] == 6 && quantidades[5] == 0) {
					quantidades[5]++;
				} else if (jogo[ln][col] == 7 && quantidades[6] == 0) {
					quantidades[6]++;
				} else if (jogo[ln][col] == 8 && quantidades[7] == 0) {
					quantidades[7]++;
				} else if (jogo[ln][col] == 9 && quantidades[8] == 0) {
					quantidades[8]++;
				} else {
					certo = false;
				}
			}
			for (int val = 0; val < quantidades.length; val++) {
				quantidades[val] = 0;
			}
		}

		for (int col = 0; col < jogo[0].length; col++) {
			for (int ln = 0; ln < jogo.length; ln++) {
				if (jogo[ln][col] == 1 && quantidades[0] == 0) {
					quantidades[0]++;
				} else if (jogo[ln][col] == 2 && quantidades[1] == 0) {
					quantidades[1]++;
				} else if (jogo[ln][col] == 3 && quantidades[2] == 0) {
					quantidades[2]++;
				} else if (jogo[ln][col] == 4 && quantidades[3] == 0) {
					quantidades[3]++;
				} else if (jogo[ln][col] == 5 && quantidades[4] == 0) {
					quantidades[4]++;
				} else if (jogo[ln][col] == 6 && quantidades[5] == 0) {
					quantidades[5]++;
				} else if (jogo[ln][col] == 7 && quantidades[6] == 0) {
					quantidades[6]++;
				} else if (jogo[ln][col] == 8 && quantidades[7] == 0) {
					quantidades[7]++;
				} else if (jogo[ln][col] == 9 && quantidades[8] == 0) {
					quantidades[8]++;
				} else {
					certo = false;
				}
			}
			for (int val = 0; val < quantidades.length; val++) {
				quantidades[val] = 0;
			}
		}

		for (int totalLn = 0; totalLn < jogo.length; totalLn += 3) {
			for (int totalCol = 0; totalCol < jogo[0].length; totalCol += 3) {
				for (int ln = totalLn; ln < (totalLn + 3); ln++) {
					for (int col = totalCol; col < (totalCol + 3); col++) {
						if (jogo[ln][col] == 1 && quantidades[0] == 0) {
							quantidades[0]++;
						} else if (jogo[ln][col] == 2 && quantidades[1] == 0) {
							quantidades[1]++;
						} else if (jogo[ln][col] == 3 && quantidades[2] == 0) {
							quantidades[2]++;
						} else if (jogo[ln][col] == 4 && quantidades[3] == 0) {
							quantidades[3]++;
						} else if (jogo[ln][col] == 5 && quantidades[4] == 0) {
							quantidades[4]++;
						} else if (jogo[ln][col] == 6 && quantidades[5] == 0) {
							quantidades[5]++;
						} else if (jogo[ln][col] == 7 && quantidades[6] == 0) {
							quantidades[6]++;
						} else if (jogo[ln][col] == 8 && quantidades[7] == 0) {
							quantidades[7]++;
						} else if (jogo[ln][col] == 9 && quantidades[8] == 0) {
							quantidades[8]++;
						} else {
							certo = false;
						}
					}
					if (ln == 2 || ln == 5 || ln == 8) {
						for (int val = 0; val < quantidades.length; val++) {
							quantidades[val] = 0;
						}
					}
				}
			}
		}

		if (certo) {
			System.out.println("Parabéns, você conseguiu finalizar o sudoku corretamente");
		} else {
			System.out.println("Que pena, você não conseguiu finalizar o sudoku corretamente");
		}

		sc.close();

	}

}
