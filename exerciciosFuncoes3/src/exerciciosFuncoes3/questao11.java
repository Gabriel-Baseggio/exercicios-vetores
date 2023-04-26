package exerciciosFuncoes3;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua frase: ");
		String frase = sc.next();

		System.out.print("Digite o número de posições que cada letra estará a frente: ");
		int numPosicoes = sc.nextInt();
		
		System.out.println("Frase criptografada: " + criptografar(frase, numPosicoes));

		sc.close();

	}

	static String criptografar(String frase, int n) {
		n %= 26;
		char[] alfabetoU = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] alfabetoL = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		String criptografada = "";
		
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			if (caracter == Character.toUpperCase(caracter)) {
				for (int j = 0; j < alfabetoU.length; j++) {
					if (alfabetoU[j] == caracter) {
						if (j + n > 25) {
							criptografada += alfabetoU[n - (26 - j)];
						} else {
							criptografada += alfabetoU[j + n];							
						}
					}
				}
			} else {
				for (int j = 0; j < alfabetoL.length; j++) {
					if (alfabetoL[j] == caracter) {
						if (j + n > 25) {
							criptografada += alfabetoL[n - (26 - j)];
						} else {
							criptografada += alfabetoL[j + n];							
						}
					}
				}
			}
		}
		
		return criptografada;

	}

}
