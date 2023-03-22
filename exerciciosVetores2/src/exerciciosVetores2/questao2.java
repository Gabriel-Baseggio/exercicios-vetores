package exerciciosVetores2;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		int[] codArtigo = new int[10];
		double[] precoArtigo = new double[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < codArtigo.length; i++) {
			System.out.print("Digite o código do artigo: ");
			codArtigo[i] = sc.nextInt();

			System.out.print("Digite o preço do artigo: R$");
			precoArtigo[i] = sc.nextDouble();
		}

		double aux;
		int aux2;

		for (int i = 0; i < codArtigo.length; i++) {
			for (int j = i + 1; j < codArtigo.length; j++) {
				if (precoArtigo[i] < precoArtigo[j]) {
					aux = precoArtigo[i];
					precoArtigo[i] = precoArtigo[j];
					precoArtigo[j] = aux;

					aux2 = codArtigo[i];
					codArtigo[i] = codArtigo[j];
					codArtigo[j] = aux2;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Código do " + (i + 1) + "º artigo mais caro: " + codArtigo[i]);
			System.out.println("Preço do " + (i + 1) + "º artigo mais caro: R$" + precoArtigo[i]);
		}

		sc.close();

	}

}
