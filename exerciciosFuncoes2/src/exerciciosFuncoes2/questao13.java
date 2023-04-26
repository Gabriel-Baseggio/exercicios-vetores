package exerciciosFuncoes2;

import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("É uma sequência binária: " + definirBinario(cadeia));

		sc.close();
	}

	static boolean definirBinario(String cadeia) {

		if (cadeia.matches("[0-1]*")) {
			return true;
		}
		
		return false;

	}

}
