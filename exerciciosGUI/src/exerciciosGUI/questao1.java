package exerciciosGUI;

import javax.swing.JOptionPane;

public class questao1 {

	public static void main(String[] args) {
		
		int posicaoX, posicaoY, distanciaZ;
		
		posicaoX= Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o X: "));
		posicaoY= Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o Y: "));
		distanciaZ= Integer.parseInt(JOptionPane.showInputDialog("Digite a dist�ncia Z: "));
		
		JOptionPane.showMessageDialog(null, "N�mero de passos que voc� deve dar: " + atravessaRua(posicaoX, posicaoY, distanciaZ));
		
	}

	static int atravessaRua(int posicaoX, int posicaoY, int distanciaZ) {
		return (int) Math.ceil((double) (posicaoY - posicaoX) / distanciaZ);
	}

}
