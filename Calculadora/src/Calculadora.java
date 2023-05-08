import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2;
		int operador;

		System.out.print("Digite o número um: ");
		num1 = sc.nextDouble();
		System.out.print("Selecione o modo de operação:\n1-Soma \n2-Subtração \n3-Dividir \n4-Multiplicação \n-> ");
		operador = sc.nextInt();
		System.out.print("Digite o número dois: ");
		num2 = sc.nextDouble();

		switch (operador) {
		case 1: {
			System.out.println("Resultado: " + somar(num1, num2));
			break;
		}

		case 2: {
			System.out.println("Resultado: " + subtrair(num1, num2));
			break;
		}

		case 3: {
			System.out.println("Resultado: " + dividir(num1, num2));
			break;
		}

		case 4: {
			System.out.println("Resultado: " + multiplicar(num1, num2));
			break;
		}

		default: {
			System.out.println("Essa opção não existe!");
		}

		}

		sc.close();
	}

	static double somar(double num1, double num2) {
		return num1 + num2;
	}

	static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	static double dividir(double num1, double num2) {
		if (num2 == 0) {
			System.out.print("O segundo número é zero , Não dá para dividir");
			return 0;
		} else {
			return num1 / num2;
		}
	}

	static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

}
