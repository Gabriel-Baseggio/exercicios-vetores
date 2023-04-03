package exerciciosMatrizes2;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int[] posMenor = new int[2];
		int[][] matriz = new int[7][4];
		int menorValor = 9999;
		Scanner sc = new Scanner(System.in);
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha: ");
				matriz[ln][col] = sc.nextInt();
				if (matriz[ln][col] < menorValor) {
					menorValor = matriz[ln][col];
					posMenor[0] = ln;
					posMenor[1] = col;
				}
			}
		}
		
		System.out.println("O menor número da matriz foi " + menorValor + ", na linha " + posMenor[0] + " e coluna " + posMenor[1]);
		
		sc.close();

	}

}
