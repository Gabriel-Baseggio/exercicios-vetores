package exerciciosFuncoes4;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite o número para inverter: ");
		num = sc.nextInt();
		
		System.out.println("Número invertido: " + inverterNumero(num));
		
		
		sc.close();

	}

	static int inverterNumero(int num) {
		int numInverso = 0, numDigitos = 1, aux = num;

		while (num >= 10) {
			num /= 10;
			numDigitos++;
		}

		while (numDigitos > 0) {
			numInverso += (aux % 10) * Math.pow(10, numDigitos - 1);
			aux /= 10;
			numDigitos--;
		}

		return numInverso;

	}

}
