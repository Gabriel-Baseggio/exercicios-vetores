package exerciciosFuncoes2;

import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("É totalmente maiúscula: " + checarMaiuscula(cadeia));

		sc.close();
	}

	static boolean checarMaiuscula(String cadeia) {

		for (int i = 0; i < cadeia.length(); i++) {
			if (cadeia.charAt(i) != Character.toUpperCase(cadeia.charAt(i))) {
				return false;
			}
		}

		return true;

	}

}
