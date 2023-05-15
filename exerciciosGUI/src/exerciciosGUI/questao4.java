package exerciciosGUI;

import javax.swing.JOptionPane;

public class questao4 {

	public static void main(String[] args) {
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));

		JOptionPane.showMessageDialog(null, "Classificação: " + classificarNota(nota));
		
	}

	static char classificarNota(double nota) {
		
		if (nota >= 9) {
			return 'A';
		} else if (nota >= 8) {
			return 'B';
		} else if (nota >= 7) {
			return 'C';
		} else if (nota >= 6) {
			return 'D';
		}
		return 'E';
	}

}
