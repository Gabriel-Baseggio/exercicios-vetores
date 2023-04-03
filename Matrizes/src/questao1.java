import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		int linhas;
		int[][] matrizA, matrizB, matrizSom, matrizSub, matrizMul;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero de linhas das matrizes A e B: ");
		linhas = sc.nextInt();

		matrizA = new int[linhas][1];
		matrizB = new int[linhas][1];
		matrizSom = new int[linhas][1];
		matrizSub = new int[linhas][1];
		matrizMul = new int[linhas][1];

		for (int ln = 0; ln < matrizA.length; ln++) {
			for (int col = 0; col < matrizA[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "� valor da " + (ln + 1) + "� linha matriz A: ");
				matrizA[ln][col] = sc.nextInt();

				System.out.print("Digite o " + (col + 1) + "� valor da " + (ln + 1) + "� linha matriz B: ");
				matrizB[ln][col] = sc.nextInt();
				
				matrizSom[ln][col] = matrizA[ln][col] + matrizB[ln][col];
				matrizSub[ln][col] = matrizA[ln][col] - matrizB[ln][col];
				matrizMul[ln][col] = matrizA[ln][col] * matrizB[ln][col];
			}
		}
		
		System.out.println(" ----- Matriz de somas ----- ");
	
		for (int ln = 0; ln < matrizA.length; ln++) {
			System.out.print("Linha " + (ln + 1) + ": ");
			for (int col = 0; col < matrizA[0].length; col++) {
				System.out.print(matrizSom[ln][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println(" ----- Matriz de subtra��es ----- ");
		
		for (int ln = 0; ln < matrizA.length; ln++) {
			System.out.print("Linha " + (ln + 1) + ": ");
			for (int col = 0; col < matrizA[0].length; col++) {
				System.out.print(matrizSub[ln][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println(" ----- Matriz de multiplica��es ----- ");
		
		for (int ln = 0; ln < matrizA.length; ln++) {
			System.out.print("Linha " + (ln + 1) + ": ");
			for (int col = 0; col < matrizA[0].length; col++) {
				System.out.print(matrizMul[ln][col] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
