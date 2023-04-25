package exerciciosFuncoes2;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		frase = sc.nextLine();


		System.out.println("Maiúsculo: " + transformarMaiusculo(frase));

		sc.close();
	}

	static String transformarMaiusculo(String frase) {
		
		return frase.toUpperCase();

	}

}
