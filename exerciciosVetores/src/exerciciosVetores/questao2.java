package exerciciosVetores;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int qtdPares = 0, aux;
		int[] numeros, pares, impares;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que serão digitados: ");		
		numeros = new int[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
			
			if ((numeros[i] % 2) == 0) {
				qtdPares++;
			}
		}
		
		pares = new int[qtdPares];
		impares = new int[numeros.length - qtdPares];
		
		int indicePar = 0, indiceImpar = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[indicePar] = numeros[i];
				indicePar++;
			} else {
				impares[indiceImpar] = numeros[i];
				indiceImpar++;
			}
		}
			
		for (int i = 0; i < pares.length; i++) {
			for (int j = i + 1; j < pares.length; j++) {
				if (pares[i] > pares[j]) {
					aux = pares[i];
					pares[i] = pares[j];
					pares[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < impares.length; i++) {
			for (int j = i + 1; j < impares.length; j++) {
				if (impares[i] < impares[j]) {
					aux = impares[i];
					impares[i] = impares[j];
					impares[j] = aux;
				}
			}
		}
		
		for (int numPar: pares) {
			System.out.print(numPar + " ");
		}
		for (int numImpar: impares) {
			System.out.print(numImpar + " ");
		}
		
		sc.close();

	}

}
