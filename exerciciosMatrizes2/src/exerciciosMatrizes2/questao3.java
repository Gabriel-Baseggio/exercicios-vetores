package exerciciosMatrizes2;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		
		int[][] matriz = new int[5][5];
		int somaLn4 = 0, somaCol2 = 0, somaDiagonalED = 0, somaDiagonalDE = 0, somaTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha: ");
				matriz[ln][col] = sc.nextInt();
				
				if (ln == 3) {
					somaLn4 += matriz[ln][col];
				}
				
				if (col == 1) {
					somaCol2 += matriz[ln][col];
				}
				
				if (ln == col) {
					somaDiagonalED += matriz[ln][col];
				}
				
				if ((ln + col) == (matriz.length - 1)) {
					somaDiagonalDE += matriz[ln][col];
				}
				
				somaTotal += matriz[ln][col];
			}
		}
		
		System.out.println("Soma da linha 4 da matriz: " + somaLn4
				+ "\nSoma da coluna 2 da matriz: " + somaCol2
				+ "\nSoma da diagonal principal da matriz: " + somaDiagonalED
				+ "\nSoma da diagonal secundária da matriz: " + somaDiagonalDE
				+ "\nSoma de todos os elementos da matriz: " + somaTotal);
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print(matriz[ln][col] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
