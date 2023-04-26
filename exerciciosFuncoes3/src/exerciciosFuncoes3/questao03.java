package exerciciosFuncoes3;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {

		String cadeia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = sc.next();

		System.out.println("Código: " + checarFrases(cadeia));

		sc.close();
	}

	static int checarFrases(String cadeia) {
		int somaAlfabeticos = 0, somaDigitos = 0;

		for (int i = 0; i < cadeia.length(); i++) {
			if (Character.toString(cadeia.charAt(i)).matches("[A-Z?]") || Character.toString(cadeia.charAt(i)).matches("[a-z?]")) {
				somaAlfabeticos++;
			} else if (Character.toString(cadeia.charAt(i)).matches("[0-9?]")) {
				somaDigitos++;
			} else {
				return -1;
			}
		}
		
		if (somaDigitos >= somaAlfabeticos) {
			return 0;			
		}
		
		return 1;

	}

}
