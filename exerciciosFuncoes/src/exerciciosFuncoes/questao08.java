package exerciciosFuncoes;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a posi��o que voc� quer pegar da sequ�ncia de Fibonacci: ");
		
		System.out.println(posicaoFibonacci(sc.nextInt()));
		
		sc.close();

	}

	static int posicaoFibonacci(int pos) {

		int atual = 1, anterior = 0, aux;
		
		for (int num = 1; num <= pos; num++) {
			aux = atual;
			atual += anterior;
			anterior = aux;
		}
		
		return atual;
		

	}

}
