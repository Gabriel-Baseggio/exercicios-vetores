package exerciciosFuncoes;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		
		if (definirPar(sc.nextInt())) {
			System.out.println("� par!");				
		} else {			
			System.out.println("� �mpar!");				
		}
		

		sc.close();

	}

	static boolean definirPar(int num) {

		if (num % 2 == 0) {
			return true;			
		} else {
			return false;						
		}
		

	}

}
