package exerciciosFuncoes4;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horas;
		String minutos;

		System.out.print("Digite a hora: ");
		horas = sc.nextInt();
		System.out.print("Digite os minutos: ");
		minutos = sc.next();
		if (horas > 12) {
			System.out.println("A hora é " + converterHora(horas) + ":" + minutos + " P.M.");
		} else {
			System.out.println("A hora é " + converterHora(horas) + ":" + minutos + " A.M.");
		}

		sc.close();
	}

	static int converterHora(int hora) {
		if (hora > 12) {
			return hora - 12;
		} else {
			return hora;
		}
	}
	
}
