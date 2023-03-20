package exerciciosVetores;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		double somaPesos = 0, nota;
		double[] mediasPonderadas, pesosProvas, somaNotasProva;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de alunos: ");
		mediasPonderadas = new double[sc.nextInt()];
		
		System.out.println();
		
		System.out.print("Digite o número de provas: ");
		pesosProvas = new double[sc.nextInt()];
		somaNotasProva = new double[pesosProvas.length];
		
		System.out.println();
		
		for (int i = 0; i < pesosProvas.length; i++) {
			System.out.print("Digite o peso da " + (i + 1) + "ª prova: ");
			pesosProvas[i] = sc.nextDouble();
			somaPesos += pesosProvas[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < mediasPonderadas.length; i++) {
			for (int j = 0; j < pesosProvas.length; j++) {
				System.out.print("Digite a nota do " + (i + 1) + "º aluno na " + (j + 1) + "ª prova: ");
				nota = sc.nextDouble();
				somaNotasProva[j] += nota;
				mediasPonderadas[i] += nota*pesosProvas[j];
			}
			mediasPonderadas[i] /= somaPesos;
		}
		
		System.out.println();
		
		System.out.println("Médias ponderadas por aluno");
		for (int i = 0; i < mediasPonderadas.length; i++) {
			System.out.println("Média ponderada do " + (i + 1) + "º aluno: " + mediasPonderadas[i]);
		}
		
		System.out.println();
		
		System.out.println("\nMédias aritméticas por prova: ");
		for (int i = 0; i < pesosProvas.length; i++) {
			System.out.println("Média aritmética da " + (i + 1) + "ª prova: " + (somaNotasProva[i])/mediasPonderadas.length);
		}
		
		sc.close();

	}

}
