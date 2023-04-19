package exerciciosProcedimentos2;

import java.util.Random;
import java.util.Scanner;

public class questao1 {

	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	static int numAleatorio = random.nextInt(1001), palpite, tentativas = 0;
	
	public static void main(String[] args) {
		
		do {
			tentativas++;
			System.out.print("Digite seu palpite: ");
			palpite  = sc.nextInt();
			
			if (palpite != numAleatorio) {
				maiorOuMenor();
			}			
			
		} while (palpite != numAleatorio);
		
		System.out.println("Você acertou em " + tentativas + " tentativas!");

	}

	static void maiorOuMenor() {
		if (palpite > numAleatorio) {
			System.out.println("Seu palpite foi maior que o número!");
		} else {
			System.out.println("Seu palpite foi menor que o número!");			
		}
	}
	
}
