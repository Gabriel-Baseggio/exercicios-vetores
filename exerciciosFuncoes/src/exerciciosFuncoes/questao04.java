package exerciciosFuncoes;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int val = sc.nextInt();

		System.out.print("Digite outro n�mero: ");
		
		if (definirMultiplo(val, sc.nextInt())) {
			System.out.println("� m�ltiplo!");				
		} else {			
			System.out.println("N�o � m�ltiplo!");		
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
