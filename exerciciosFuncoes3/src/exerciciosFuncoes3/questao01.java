package exerciciosFuncoes3;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("� totalmente min�scula: " + checarMinuscula(cadeia));

		sc.close();
	}

	static boolean checarMinuscula(String cadeia) {

		if (cadeia.equals(cadeia.toLowerCase())) {
			return true;
		}

		return false;

	}

}
