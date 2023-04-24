package exerciciosFuncoes;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		
		if (definirBissexto(sc.nextInt())) {
			System.out.println("É bissexto!");				
		} else {			
			System.out.println("Não é bissexto!");		
		}
		

		sc.close();

	}

	static boolean definirBissexto(int ano) {

		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			return true;			
		} else {
			return false;						
		}
		

	}

}
