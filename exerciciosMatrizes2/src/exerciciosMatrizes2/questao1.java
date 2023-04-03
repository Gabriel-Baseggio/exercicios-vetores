package exerciciosMatrizes2;

import java.util.Random;

public class questao1 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		double somaPares = 0, qtdPares = 0.0;
		Random random = new Random();		
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				matriz[ln][col] = random.nextInt(25);
				if ((matriz[ln][col] % 2) == 0) {
					somaPares += matriz[ln][col];
					qtdPares++;
				}
			}
		}
		
		System.out.println("A média dos números pares foi: " + (somaPares / qtdPares));		

	}

}
