package exerciciosFuncoes2;

import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("É um palíndromo: " + checarPalindromo(cadeia));

		sc.close();
	}

	static boolean checarPalindromo(String cadeia) {

		for (int i = 0; i < (cadeia.length() / 2); i++) {
			if (cadeia.charAt(i) != cadeia.charAt((cadeia.length() - 1) - i)) {
				return false;
			}
		}

		return true;

	}

}
