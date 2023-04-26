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

		if (cadeia.equals(cadeia.toUpperCase())) {
			return true;
		}

		return false;

	}

}
