package exerciciosFuncoes3;

public class questao08 {

	public static void main(String[] args) {

		System.out.print("Números palíndromos entre 1000 e 9999: ");
		
		for (int i = 1000; i <= 9999; i++) {
			if (verificarNumero(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

	static boolean verificarNumero(int num) {
		
		int primeiro = num / 100, segundo = num % 100;
		int soma = primeiro + segundo;
		
		if (num == (soma * soma)) {
			return true;			
		}
		
		return false;		

	}

}
