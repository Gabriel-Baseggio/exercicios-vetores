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
		
		System.out.print("Digite um n�mero de 0 a 100: ");
		num = sc.nextInt();
		
		for (int i = 0; i < aleatorios.length; i++) {
			if (aleatorios[i] == num) {
				System.out.println("Est� no vetor, na posi��o " + i);
			} else if (i == (aleatorios.length - 1)) {
				System.out.println("N�o estava no vetor");
			}
		}
		
		sc.close();

	}

}
