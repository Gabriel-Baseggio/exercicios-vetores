package exerciciosMatrizes3;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Scanner sc = new Scanner(System.in);

		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha: ");
				matriz[ln][col] = sc.nextInt();
			}
		}

		
		for (int i = 0; i < 2; i++) {	
			if (i == 0) {
				System.out.println("Elementos da diagonal principal: ");
			} else {
				System.out.println("Elementos fora da diagonal principal: ");				
			}
			for (int ln = 0; ln < matriz.length; ln++) {
				for (int col = 0; col < matriz[0].length; col++) {
					if (ln == col && i == 0) {
						System.out.print(matriz[ln][col] + " ");
					}
					if (ln != col && i == 1) {
						System.out.print(matriz[ln][col] + " ");						
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {	
			if (i == 0) {
				System.out.println("Elementos da diagonal secundária: ");
			} else {
				System.out.println("Elementos fora da diagonal secundária: ");				
			}
			for (int ln = 0; ln < matriz.length; ln++) {
				for (int col = 0; col < matriz[0].length; col++) {
					if ((ln + col) == (matriz.length - 1) && i == 0) {
						System.out.print(matriz[ln][col] + " ");
					}
					if ((ln + col) != (matriz.length - 1) && i == 1) {
						System.out.print(matriz[ln][col] + " ");						
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {	
			if (i == 0) {
				System.out.println("Elementos da diagonal principal e da secundária: ");
			} else {
				System.out.println("Elementos fora da diagonal principal e da secundária: ");				
			}
			for (int ln = 0; ln < matriz.length; ln++) {
				for (int col = 0; col < matriz[0].length; col++) {
					if ((ln == col || (ln + col) == (matriz.length - 1)) && i == 0) {
						System.out.print(matriz[ln][col] + " ");
					}
					if ((ln != col && (ln + col) != (matriz.length - 1)) && i == 1) {
						System.out.print(matriz[ln][col] + " ");						
					}
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
