package exerciciosFuncoes3;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para fatorar: ");

		System.out.println(fatorar(sc.nextInt()));

		sc.close();

	}

	static int fatorar(int valor) {

		for (int num = (valor - 1); num > 0; num--) {
			valor *= num;
		}

		return valor;

	}

}
