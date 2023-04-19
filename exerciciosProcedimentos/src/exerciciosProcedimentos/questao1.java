package exerciciosProcedimentos;

import java.util.Scanner;

public class questao1 {

	static Scanner sc = new Scanner(System.in);
	static double valor;
	
	public static void main(String[] args) {
		
		int escolha;
		
		System.out.print("Digite o valor em reais: R$");
		valor = sc.nextDouble();
		
		System.out.print("Quer converter para: \n1 - Doláres \n2 - Yenes \n-> ");
		escolha = sc.nextInt();
		
		switch (escolha) {
		case 1: 
			converterDolar();
			System.out.printf("O valor em dólares seria: $%.2f", valor);
			break;
		case 2:
			converterYen();
			System.out.printf("O valor em yenes seria: ¥%3.2f", valor);
			break;
		default:
			System.out.println("Opção incorreta!");
		}
		
		sc.close();

	}
	
	static void converterDolar() {
		valor *= 0.3;
	}
	
	static void converterYen() {
		valor *= 30;
	}

}
