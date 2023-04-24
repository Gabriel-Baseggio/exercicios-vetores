package exerciciosFuncoes;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int val = sc.nextInt();

		System.out.print("Digite outro número: ");
		
		if (definirMultiplo(val, sc.nextInt())) {
			System.out.println("É múltiplo!");				
		} else {			
			System.out.println("Não é múltiplo!");		
		}
		

		sc.close();

	}

	static boolean definirMultiplo(int num, int multiplo) {

		if (num % multiplo == 0) {
			return true;			
		} else {
			return false;						
		}
		

	}

}
