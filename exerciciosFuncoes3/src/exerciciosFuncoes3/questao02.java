package exerciciosFuncoes3;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {

		String cadeia1, cadeia2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia1 = sc.next();
		
		System.out.print("Digite outra cadeia de caracteres: ");
		cadeia2 = sc.next();

		System.out.println("As duas frases são iguais: " + checarFrases(cadeia1, cadeia2));

		sc.close();
	}

	static boolean checarFrases(String cadeia1, String cadeia2) {
		
		if (cadeia1.length() != cadeia2.length()) {
			return false;
		}

		for (int i = 0; i < cadeia1.length(); i++) {
			if (cadeia1.charAt(i) != cadeia2.charAt(i)) {
				return false;				
			}
		}

		return true;

	}

}
