package exerciciosVetores;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		double[] notas = new double[10];
		double maiorNota = 0, somaNotas = 0;
		int numAlunosAcima = 0, numPosicoesMaioresNotas = 0;
		int[] posicoesMaioresNotas;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
			notas[i] = sc.nextDouble();
			
			if (notas[i] >= maiorNota) {
				maiorNota = notas[i];
			}
			
			somaNotas += notas[i];
		}
		
		for (int i = 0; i < 10; i++) {
			if (notas[i] == maiorNota) {
				numPosicoesMaioresNotas++;
			}
		}
		
		posicoesMaioresNotas = new int[numPosicoesMaioresNotas];
		
		
		int aux = 0;
		for (int i = 0; i < 10; i++) {
			if (notas[i] == maiorNota) {
				posicoesMaioresNotas[aux] = i;
				aux++;
			}
			
			if (notas[i] >= (somaNotas/10)) {
				numAlunosAcima++;
			}
		}
		
		System.out.println("Média da turma: " + (somaNotas/10));
		System.out.println("Número de alunos acima da média da turma: " + numAlunosAcima);
		System.out.println("A maior nota digitada foi: " + maiorNota);
		System.out.print("Posições em que a maior nota aparece: ");
		for (int posicao: posicoesMaioresNotas) {
			System.out.print(posicao + " ");
		}

		sc.close();

	}

}
