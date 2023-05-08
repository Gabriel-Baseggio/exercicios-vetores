package exerciciosFuncoes4;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorPrestacao, valorTotal = 0;
		int diasAtraso, totalContas = 0;

		do {

			System.out.print("Digite o valor da prestação: R$");
			valorPrestacao = sc.nextDouble();
			if (valorPrestacao == 0) {
				break;
			}
			System.out.print("Digite os dias de atraso: ");
			diasAtraso = sc.nextInt();
			valorTotal += valorPagamento(valorPrestacao, diasAtraso);
			totalContas++;
			System.out.println("Valor a ser pago \nR$:" + valorPagamento(valorPrestacao, diasAtraso));

		} while (valorPrestacao != 0);

		System.out.println("Valor total de prestações: R$" + valorTotal);
		System.out.println("Total de prestações:" + totalContas);

		sc.close();
	}

	static double valorPagamento(double valorPrestacao, int diasAtraso) {
		if (diasAtraso == 0) {
			return valorPrestacao;
		}

		return (valorPrestacao * 1.03) + (valorPrestacao * (0.1 * diasAtraso));
	}
}
