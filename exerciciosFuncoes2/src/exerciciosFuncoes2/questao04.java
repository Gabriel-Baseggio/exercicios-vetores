package exerciciosFuncoes2;

import java.util.Scanner;

public class questao04 {

	static char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	public static void main(String[] args) {

		char caractere;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);


		System.out.println("É caractere: " + checarCaractere(caractere));

		sc.close();
	}

	static boolean checarCaractere(char caractere) {

		for (int i = 0; i < alfabeto.length; i++) {
			if (caractere  == alfabeto[i]) {
				return true;
			}
		}
		
		return false;

	}

}
