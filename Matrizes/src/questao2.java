import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		Scanner sc = new Scanner(System.in);
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print("Digite o " + (col + 1) + "º valor da " + (ln + 1) + "ª linha da matriz: ");
				matriz[ln][col] = sc.nextInt();
			}
		}
		
		for (int ln = 0; ln < matriz.length; ln++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (ln == col) {
					System.out.print(matriz[ln][col] + " ");
				}
			}
		}
		
		
		sc.close();

	}

}
