package exerciciosFuncoes2;

import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("� uma sequ�ncia bin�ria: " + definirBinario(cadeia));

		sc.close();
	}

	static boolean definirBinario(String cadeia) {

		for (int i = 0; i < cadeia.length(); i++) {
			if (cadeia.charAt(i) != '0' && cadeia.charAt(i) != '1') {
				return false;
			}
		}

		return true;

	}

}
