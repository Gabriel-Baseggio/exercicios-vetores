package exerciciosFuncoes;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Você é: \n1 - Mulher \n2 - Homem \n-> ");
		int sexo = sc.nextInt();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite seu peso em kg: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura em cm: ");
		
		double geb = definirGEB(sexo, idade, peso, sc.nextDouble());
		
		System.out.println("Seu Gasto Energético Basal é de: " + geb);
		
		sc.close();

	}

	static double definirGEB(int sexo, int idade, double peso, double altura) {

		if (sexo == 1) {
			return 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);			
		} else {
			return (66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade));						
		}
		
		

	}

}
