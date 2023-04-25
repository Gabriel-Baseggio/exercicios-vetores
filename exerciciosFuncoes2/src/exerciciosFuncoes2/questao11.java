package exerciciosFuncoes2;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		frase = sc.nextLine();


		System.out.println("Minúsculo: " + transformarMinusculo(frase));

		sc.close();
	}

	static String transformarMinusculo(String frase) {
		
		return frase.toLowerCase();

	}

}
