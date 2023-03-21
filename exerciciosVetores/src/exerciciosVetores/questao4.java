package exerciciosVetores;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		double somaPesos = 0, nota;
		double[] mediasPonderadas, pesosProvas, somaNotasProva;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de alunos: ");
		mediasPonderadas = new double[sc.nextInt()];
		
		System.out.println();
		
		System.out.print("Digite o n�mero de provas: ");
		pesosProvas = new double[sc.nextInt()];
		somaNotasProva = new double[pesosProvas.length];
		
		System.out.println();
		
		for (int i = 0; i < pesosProvas.length; i++) {
			System.out.print("Digite o peso da " + (i + 1) + "� prova: ");
			pesosProvas[i] = sc.nextDouble();
			somaPesos += pesosProvas[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < mediasPonderadas.length; i++) {
			for (int j = 0; j < pesosProvas.length; j++) {
				System.out.print("Digite a nota do " + (i + 1) + "� aluno na " + (j + 1) + "� prova: ");
				nota = sc.nextDouble();
				somaNotasProva[j] += nota;
				mediasPonderadas[i] += nota*pesosProvas[j];
			}
			mediasPonderadas[i] /= somaPesos;
		}
		
		System.out.println();
		
		System.out.println("M�dias ponderadas por aluno");
		for (int i = 0; i < mediasPonderadas.length; i++) {
			System.out.println("M�dia ponderada do " + (i + 1) + "� aluno: " + mediasPonderadas[i]);
		}
		
		System.out.println();
		
		System.out.println("\nM�dias aritm�ticas por prova: ");
		for (int i = 0; i < pesosProvas.length; i++) {
			System.out.println("M�dia aritm�tica da " + (i + 1) + "� prova: " + (somaNotasProva[i])/mediasPonderadas.length);
		}
		
		sc.close();

	}

}
