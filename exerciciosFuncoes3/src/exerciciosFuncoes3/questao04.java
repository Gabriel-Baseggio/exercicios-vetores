package exerciciosFuncoes3;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivos: ");
		num = sc.nextInt();

		System.out.println("Número de digitos: " + checarNumDigitos(num));

		sc.close();
	}

	static int checarNumDigitos(int num) {
		int numDigitos = 1;
		
		while (num >= 10) {
			num /= 10;
			numDigitos++;
		}
		
		return numDigitos;

	}

}
