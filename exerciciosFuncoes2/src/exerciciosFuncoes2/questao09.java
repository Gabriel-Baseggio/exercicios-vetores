package exerciciosFuncoes2;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {

		char caractere;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);


		System.out.println("Minúsculo: " + transformarMinusculo(caractere));

		sc.close();
	}

	static char transformarMinusculo(char caractere) {
		
		return Character.toLowerCase(caractere);

	}

}
