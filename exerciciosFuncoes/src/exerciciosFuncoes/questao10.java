package exerciciosFuncoes;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Você é: \n1 - Mulher \n2 - Homem \n-> ");
		int sexo = sc.nextInt();
		System.out.print("Digite sua altura em m: ");
		
		double pesoIdeal = definirPesoIdeal(sexo, sc.nextDouble());
		
		System.out.println("Seu peso ideal é de " + pesoIdeal + "kg.");
		
		sc.close();

	}

	static double definirPesoIdeal(int sexo, double altura) {

		if (sexo == 1) {
			return (72.7 * altura) - 58;			
		} else {
			return (62.1 * altura) - 44.7;					
		}
		
		

	}

}
