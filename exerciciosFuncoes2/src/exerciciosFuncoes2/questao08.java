package exerciciosFuncoes2;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {

		char caractere;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);


		System.out.println("Maiúsculo: " + transformarMaiusculo(caractere));

		sc.close();
	}

	static char transformarMaiusculo(char caractere) {
		
		return Character.toUpperCase(caractere);

	}

}
