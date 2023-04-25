package exerciciosFuncoes2;

import java.util.Scanner;

public class questao07 {

	static char[] digitos = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

	public static void main(String[] args) {

		char caractere;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);


		System.out.println("É dígito: " + checarCaractere(caractere));

		sc.close();
	}

	static boolean checarCaractere(char caractere) {

		for (int i = 0; i < digitos.length; i++) {
			if (caractere  == digitos[i]) {
				return true;
			}
		}
		
		return false;

	}

}
