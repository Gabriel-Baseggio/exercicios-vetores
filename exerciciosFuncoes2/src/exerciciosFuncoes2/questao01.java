package exerciciosFuncoes2;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		
		
		double valorFahrenheit;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor a ser convertido de Fahrenheit para Celsius: ");
		valorFahrenheit = sc.nextDouble();
		
		System.out.println(valorFahrenheit + "F° equivale a " + converterFahrenheit(valorFahrenheit) + "C°!");
		
		sc.close();
	}
	
	static double converterFahrenheit (double fahrenheit) {
		
		return 5 * (fahrenheit - 32) / 9;
		
	}

}
