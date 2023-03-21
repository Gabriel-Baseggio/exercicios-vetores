package exerciciosVetores;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		int[] aleatorios = new int[10];
		int num;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) (Math.random()*100);
		}
		
		System.out.print("Digite um número de 0 a 100: ");
		num = sc.nextInt();
		
		for (int i = 0; i < aleatorios.length; i++) {
			if (aleatorios[i] == num) {
				System.out.println("Está no vetor, na posição " + i);
			} else if (i == (aleatorios.length - 1)) {
				System.out.println("Não estava no vetor");
			}
		}
		
		sc.close();

	}

}
