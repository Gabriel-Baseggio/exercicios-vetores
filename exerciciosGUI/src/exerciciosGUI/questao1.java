package exerciciosGUI;

import javax.swing.JOptionPane;

public class questao1 {

	public static void main(String[] args) {
		
		int posicaoX, posicaoY, distanciaZ;
		
		posicaoX= Integer.parseInt(JOptionPane.showInputDialog("Digite a posição X: "));
		posicaoY= Integer.parseInt(JOptionPane.showInputDialog("Digite a posição Y: "));
		distanciaZ= Integer.parseInt(JOptionPane.showInputDialog("Digite a distância Z: "));
		
		JOptionPane.showMessageDialog(null, "Número de passos que você deve dar: " + atravessaRua(posicaoX, posicaoY, distanciaZ));
		
	}

	static int atravessaRua(int posicaoX, int posicaoY, int distanciaZ) {
		return (int) Math.ceil((double) (posicaoY - posicaoX) / distanciaZ);
	}

}
