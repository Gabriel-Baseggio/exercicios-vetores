package exerciciosFuncoes2;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		
		
		int valor, vezes;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1� valor da multiplica��o: ");
		valor = sc.nextInt();
		System.out.print("Digite o 2� valor da multiplica��o: ");
		vezes = sc.nextInt();
		
		System.out.println("Resultado: " + somasSucessivas(valor, vezes));
		
		sc.close();
	}
	
	static int somasSucessivas (int valor, int vezes) {
		int aux = valor;
		
		for (int i = 1; i < vezes; i++) {
			valor += aux;
		}
		
		return valor;
		
	}

}
