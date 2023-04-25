package exerciciosFuncoes2;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {

		String nome;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome completo: ");
		nome = sc.nextLine();

		System.out.println("Sobrenome: " + pegarSobrenome(nome));

		sc.close();
	}

	static String pegarSobrenome(String nome) {

		for (int i = nome.length() - 1; i > 0; i--) {

			if (nome.charAt(i) == ' ') {
				return nome.substring(i + 1);
			}

		}

		return "Não tem";

	}

}
