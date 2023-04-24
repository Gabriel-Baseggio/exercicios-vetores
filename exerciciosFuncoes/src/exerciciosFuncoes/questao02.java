package exerciciosFuncoes;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		System.out.println(retornarAbsoluto(sc.nextInt()));	

		sc.close();

	}

	static int retornarAbsoluto(int num) {

		if (num > 0) {
			return num;			
		} else {
			return num * -1;						
		}
		

	}

}
