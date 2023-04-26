package exerciciosFuncoes3;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua altura em metros: ");
		double altura = sc.nextDouble();

		System.out.print("Digite seu peso em kg: ");
		double peso = sc.nextDouble();

		double imc = calcularIMC(altura, peso);
		
		System.out.println("Resultado: " + imc);
		System.out.println("Interpretação: " + interpretarIMC(imc));

		sc.close();

	}

	static double calcularIMC(double altura, double peso) {

		return peso / (altura * altura);

	}
	
	static String interpretarIMC(double imc) {
			
		if (imc < 20) {
			return "Magro";			
		} else if (imc <= 24) {
			return "Normal";			
		} else if (imc <= 29) {
			return "Acima do peso";			
		} else if (imc <= 34) {
			return "Obeso";			
		} else {
			return "Muito Obeso";
		}
		
		
	}

}
