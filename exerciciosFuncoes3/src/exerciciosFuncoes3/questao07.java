package exerciciosFuncoes3;

public class questao07 {

	public static void main(String[] args) {

		System.out.print("Números palíndromos entre 1000 e 10000: ");
		
		for (int i = 1000; i <= 10000; i++) {
			if (i == inverterNumero(i)) {
				System.out.println(i + " ");
			}
		}
		
	}

	static int inverterNumero(int num) {
		int numInverso = 0, numDigitos = 1, aux = num;
		
		while (num >= 10) {
			num /= 10;
			numDigitos++;
		}
		
		while (numDigitos > 0) {
			numInverso += (aux % 10) * Math.pow(10, numDigitos - 1);
			aux /= 10;
			numDigitos--;
		}
		
		return numInverso;

	}

}
