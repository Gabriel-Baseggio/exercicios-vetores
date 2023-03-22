package exerciciosVetores2;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int[] vetorX = new int[15];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < vetorX.length; i++) {
			System.out.print("Digite o valor do " + (i + 1) + "º elemento: ");
			vetorX[i] = sc.nextInt();
			
			if (vetorX[i] < 0) {
				vetorX[i] = 0;
			}
		}
		
		for (int valor: vetorX) {
			System.out.print(valor + " | ");
		}
		
		sc.close();

	}

}
