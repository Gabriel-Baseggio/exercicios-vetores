package appFolhaPgto;

import java.util.Scanner;

public class appFolhaPgto {

	public static void main(String[] args) {

		double[][] dadosFunc;
		String[] nomesFunc;
		int nFuncionarios;
		double somaSalBruto = 0, somaINSS = 0, somaImpRenda = 0, somaSalLiq = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero de funcion�rios a serem cadastrados: ");
		nFuncionarios = sc.nextInt();
		if (nFuncionarios > 0) {
			nomesFunc = new String[nFuncionarios];
			dadosFunc = new double[nFuncionarios][4];

			for (int ln = 0; ln < dadosFunc.length; ln++) {
				System.out.println("\n ========== Cadastro de funcion�rio ========== ");
				do {
					System.out.print("Digite o nome do funcion�rio: ");
					nomesFunc[ln] = sc.next();
					if (nomesFunc[ln].length() < 2) {
						System.out.println("Tamanho de nome inv�lido, nome deve ter no m�nimo 2 caracteres, reinsira!");
					}
				} while (nomesFunc[ln].length() < 2);

				do {
					System.out.print("Digite o sal�rio do funcion�rio: R$");
					dadosFunc[ln][0] = sc.nextDouble();
					if (dadosFunc[ln][0] <= 465) {
						System.out.println("Sal�rio inv�lido, sal�rio deve ser no m�nimo 465,00 reais, reinsira!");
					}
				} while (dadosFunc[ln][0] <= 465);

				if (dadosFunc[ln][0] <= 965.67) {
					dadosFunc[ln][1] = dadosFunc[ln][0] * 0.08;
				} else if (dadosFunc[ln][0] <= 1609.45) {
					dadosFunc[ln][1] = dadosFunc[ln][0] * 0.09;
				} else if (dadosFunc[ln][0] <= 3218.9) {
					dadosFunc[ln][1] = dadosFunc[ln][0] * 0.11;
				} else {
					dadosFunc[ln][1] = 354.07;
				}

				if (dadosFunc[ln][0] <= 1434) {
					dadosFunc[ln][2] = dadosFunc[ln][0] * 0;
				} else if (dadosFunc[ln][0] <= 2150) {
					dadosFunc[ln][2] = dadosFunc[ln][0] * 0.075;
				} else if (dadosFunc[ln][0] <= 2886) {
					dadosFunc[ln][2] = dadosFunc[ln][0] * 0.15;
				} else if (dadosFunc[ln][0] <= 3582) {
					dadosFunc[ln][2] = dadosFunc[ln][0] * 0.225;
				} else {
					dadosFunc[ln][2] = dadosFunc[ln][0] * 0.275;
				}

				dadosFunc[ln][3] = dadosFunc[ln][0] - dadosFunc[ln][1] - dadosFunc[ln][2];

				somaSalBruto += dadosFunc[ln][0];
				somaINSS += dadosFunc[ln][1];
				somaImpRenda += dadosFunc[ln][2];
				somaSalLiq += dadosFunc[ln][3];
			}

			System.out.println("\n ========== Resumos das folhas de pagamento ==========");
			for (int ln = 0; ln < dadosFunc.length; ln++) {
				System.out.println("Nome: " + nomesFunc[ln]);
				System.out.println("Sal�rio bruto: R$" + dadosFunc[ln][0]);
				System.out.println("Desconto INSS: R$" + dadosFunc[ln][1]);
				System.out.println("Imposto de Renda: R$" + dadosFunc[ln][2]);
				System.out.println("Sal�rio l�quido: R$" + dadosFunc[ln][3]);
				System.out.println();
			}
			System.out.println(" ========== Totaliza��es ========== ");
			System.out.println("Soma de todos os sal�rios brutos: R$" + somaSalBruto);
			System.out.println("Soma de todos os descontos do INSS: R$" + somaINSS);
			System.out.println("Soma de todos os impostos de renda: R$" + somaImpRenda);
			System.out.println("Soma de todos os sal�rios l�quidos: R$" + somaSalLiq);

		} else {
			System.out.println("N�mero de funcion�rios inv�lido! \nEncerrando o programa!");
		}

		sc.close();

	}

}
