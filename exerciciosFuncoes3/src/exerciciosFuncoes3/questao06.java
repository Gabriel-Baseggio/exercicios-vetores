package exerciciosFuncoes3;

public class questao06 {

	public static void main(String[] args) {

		System.out.print("Números perfeitos entre 1 e 500: ");
		
		for (int i = 1; i <= 500; i++) {
			if (checarPerfeito(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

	static boolean checarPerfeito(int num) {
		int somaDivisores = 0;
		
		for (int i = num - 1; i > 0; i--) {
			if (num % i == 0) {
				somaDivisores += i;
			}
		}
		if (somaDivisores == num) {
			return true;
		}
		
		return false;

	}

}
