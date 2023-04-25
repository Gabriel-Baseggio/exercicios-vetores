package exerciciosFuncoes2;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {

		int base, expoente;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1º valor da potenciação: ");
		base = sc.nextInt();
		System.out.print("Digite o 2º valor da potenciação: ");
		expoente = sc.nextInt();

		System.out.println("Resultado: " + multiSucessivas(base, expoente));

		sc.close();
	}

	static int multiSucessivas(int base, int expoente) {
		int aux = base;

		for (int i = 1; i < expoente; i++) {
			base *= aux;
		}

		return base;

	}

}
