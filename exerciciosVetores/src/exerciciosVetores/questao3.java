package exerciciosVetores;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {

		int[] vetor1 = new int[5], vetor2 = new int[vetor1.length], diferencas = new int[vetor1.length],
				somas = new int[vetor1.length], multiplicacoes = new int[vetor1.length];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor para o primeiro vetor: ");
			vetor1[i] = sc.nextInt();
			System.out.print("Digite o " + (i + 1) + "º valor para o segundo vetor: ");
			vetor2[i] = sc.nextInt();
			
			diferencas[i] = (vetor1[i] - vetor2[i]);
			somas[i] = (vetor1[i] + vetor2[i]);
			multiplicacoes[i] = (vetor1[i] * vetor2[i]);
		}
		
		System.out.print("Diferenças: ");
		for (int valor: diferencas) {
			System.out.print(valor + " ");
		}
		System.out.print("\nSomas: ");
		for (int valor: somas) {
			System.out.print(valor + " ");
		}
		System.out.print("\nMultiplicações: ");
		for (int valor: multiplicacoes) {
			System.out.print(valor + " ");
		}

		sc.close();

	}

}
