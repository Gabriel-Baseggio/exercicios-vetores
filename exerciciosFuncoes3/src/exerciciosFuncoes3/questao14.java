package exerciciosFuncoes3;

import java.util.Scanner;
import java.util.Arrays;

public class questao14 {

	public static void main(String[] args) {
		
		int numAluno;
		double[] notas = new double[4];
		double notaFinal;
		Scanner sc = new Scanner(System.in);
		
		for (int cont = 1; cont <= 80; cont++) {
			System.out.print("Digite o número do " + cont + "º aluno: ");
			numAluno = sc.nextInt();
			
			for (int pos = 0; pos < notas.length; pos++) {
				System.out.print("Digite a " + (pos + 1) + "ª nota do aluno " + numAluno + ": ");
				notas[pos] = sc.nextDouble();
			}
			
			System.out.print("Digite a nota da prova final do aluno: ");
			notaFinal = sc.nextDouble();
			
			double somaNotaFinal = definirNotaFinal(notas, notaFinal);
			
			System.out.println("Sua nota final foi: " + somaNotaFinal);
			System.out.println("Seu conceito final foi: " + definirConceito(somaNotaFinal));
			
			System.out.println();
		}
		
		sc.close();

	}

	static double definirNotaFinal(double[] notas, double provaFinal) {
		
		Arrays.sort(notas);
		
		return (notas[0] + notas[1] + notas[2] + provaFinal);

	}
	
	static String definirConceito(double notaFinal) {
		
		if (notaFinal <= 100 && notaFinal >= 90) {
			return "A";			
		} else if (notaFinal >= 80) {
			return "B";			
		} else if (notaFinal >= 70) {
			return "C";			
		} else if (notaFinal >= 60) {
			return "D";			
		} else if (notaFinal >= 40) {
			return "E";			
		} else {
			return "F";
		}


	}

}
