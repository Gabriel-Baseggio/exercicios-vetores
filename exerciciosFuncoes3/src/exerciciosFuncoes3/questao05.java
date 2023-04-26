package exerciciosFuncoes3;

public class questao05 {

	public static void main(String[] args) {

		System.out.print("Primos entre 10 e 100: ");
		
		for (int i = 10; i <= 100; i++) {
			if (checarPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

	static boolean checarPrimo(int num) {
		int numDivisoes = 0;
		
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				numDivisoes++;
			}
			if (numDivisoes > 2) {
				return false;
			}
		}
		
		return true;

	}

}
