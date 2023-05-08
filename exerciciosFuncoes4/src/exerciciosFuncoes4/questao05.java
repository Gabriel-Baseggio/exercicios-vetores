package exerciciosFuncoes4;

public class questao05 {

	public static void main(String[] args) {

		System.out.println("--- Jogo de Craps ---");

		int valorDados = (int) (Math.random() * 11) + 1;

		System.out.println("Seus dados: " + valorDados);

		checarJogo(valorDados);

	}

	static void checarJogo(int dados) {
		
		if (dados == 2 || dados == 3 || dados == 12) {
			System.out.println("Craps! Você perdeu!");
		} else if (dados == 7 || dados == 11) {
			System.out.println("Natural! Você ganhou!");
		} else {
			int ponto = dados;
			System.out.println("Ponto: " + ponto);
			do {
				dados = (int) (Math.random()*11) + 1;		
				System.out.println("Dados: " + dados);
				if (dados == 7) {
					System.out.println("Você perdeu!");
					break;
				} else if (dados == ponto) {
					System.out.println("Você ganhou!");
					break;
				}
			} while(dados != ponto);			
		}
	}

}
