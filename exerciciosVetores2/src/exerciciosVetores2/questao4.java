package exerciciosVetores2;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {

		int iguais = 0;
		int[] vetor1, vetor2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho dos vetores: ");
		vetor1 = new int[sc.nextInt()];
		vetor2 = new int[vetor1.length];

		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("\nDigite o " + (i + 1) + "º valor do vetor 1: ");
			vetor1[i] = sc.nextInt();
			System.out.print("Digite o " + (i + 1) + "º valor do vetor 2: ");
			vetor2[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] == vetor2[i]) {
				iguais++;
			} else if (i == (vetor1.length - 1)) {
				System.out.println("Conteúdos diferentes!");
				break;
			}
		}
		
		if (iguais == vetor1.length) {
			System.out.println("Conteúdos iguais!");
		}

		sc.close();

	}

}
