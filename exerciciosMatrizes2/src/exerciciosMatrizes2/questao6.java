package exerciciosMatrizes2;

public class questao6 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[7][8];
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				matriz[ln][col] = ln + col;
				System.out.print(matriz[ln][col] + " ");
			}
			System.out.println();
		}

	}

}
