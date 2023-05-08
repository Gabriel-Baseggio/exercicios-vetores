package exerciciosFuncoes4;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		num = sc.nextInt();

		System.out.println("Numero de digitos: " + digitos(num));

		sc.close();
	}

	static int digitos(int num) {
		int numero = 1;

		while (num >= 10) {
			num /= 10;
			numero++;
		}

		return numero;

	}

}
