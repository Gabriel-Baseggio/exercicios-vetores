package exerciciosMatrizes2;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		
		double[][] matriz = new double[3][4];
		Scanner sc = new Scanner(System.in);
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha: ");
				matriz[ln][col] = sc.nextDouble();
			}
		}
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (col == 0 && ln == 0) {
					System.out.print("Canto superior esquerdo: " + matriz[ln][col] + " ");
				}
				if (col == 0 && ln == matriz.length - 1) {
					System.out.print("\nCanto inferior esquerdo: " + matriz[ln][col] + " ");
				}
			}
		}
		
		sc.close();

	}

}
