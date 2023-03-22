package exerciciosVetores2;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		String mes = "", mesMaiorTemp = "", mesMenorTemp = "";
		int maiorTemp = -999, menorTemp = 999;
		int[] temperaturas = new int[12];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			switch (i) {
			case 0:
				mes = "Janeiro";
				break;
			case 1:
				mes = "Fevereiro";
				break;
			case 2:
				mes = "Março";
				break;
			case 3:
				mes = "Abril";
				break;
			case 4:
				mes = "Maio";
				break;
			case 5:
				mes = "Junho";
				break;
			case 6:
				mes = "Julho";
				break;
			case 7:
				mes = "Agosto";
				break;
			case 8:
				mes = "Setembro";
				break;
			case 9:
				mes = "Outubro";
				break;
			case 10:
				mes = "Novembro";
				break;
			case 11:
				mes = "Dezembro";
				break;
			}
			
			System.out.print("Digite a temperatura média de " + mes + ": ");
			temperaturas[i] = sc.nextInt();
			
			if (temperaturas[i] > maiorTemp) {
				mesMaiorTemp = mes;
				maiorTemp = temperaturas[i];
			}
			
			if (temperaturas[i] < menorTemp) {
				mesMenorTemp = mes;
				menorTemp = temperaturas[i];
			}
		}
		
		
		System.out.println("A maior temperatura média foi em " + mesMaiorTemp);
		System.out.println("A menor temperatura média foi em " + mesMenorTemp);
		
		
		sc.close();

	}

}
