package exerciciosFuncoes3;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int cont = 1; cont < 10; cont++) {
			System.out.print("Digite um número inteiro positivo: ");
			int num1 = sc.nextInt();
			
			System.out.print("Digite outro número inteiro positivo: ");
			int num2 = sc.nextInt();
			
			System.out.println("Resultado: " + multiLouca(num1, num2));			
		}
		
		
		
		sc.close();
		
	}

	static int multiLouca(int num1, int num2) {
		
		int resultado = 0;
		
		if (num1 % 2 == 1) {
			resultado = num2;
		}
		
		while (num1 > 1) {
			num1 /= 2;
			num2 *= 2;				
			if (num1 % 2 == 1) {
				resultado += num2;
			}
		}
		
		return resultado;

	}

}
