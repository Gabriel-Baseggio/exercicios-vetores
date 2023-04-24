package exerciciosFuncoes;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número para mostrar a tabuada: ");
		mostrarTabuada(sc.nextInt());
		
		sc.close();

	}
	
	static void mostrarTabuada(int num) {
		
		for (int val = 1; val <= 10; val++) {
			System.out.println(val + " x " + num + " = " + (num * val));
		}
		
	}

}
