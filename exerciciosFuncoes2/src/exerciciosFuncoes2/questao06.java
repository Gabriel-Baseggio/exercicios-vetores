package exerciciosFuncoes2;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {

		char caractere;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);

		System.out.println("É alfabético minúsculo: " + checarCaractere(caractere));

		sc.close();
	}

	static boolean checarCaractere(char caractere) {

		if (Character.toString(caractere).matches("[a-z?]")) {
			return true;
		}
		
		return false;

	}

}
