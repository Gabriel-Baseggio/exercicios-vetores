package reservaVoos;

import javax.swing.JOptionPane;

public class reservasVoos {

	public static void main(String[] args) {
		
		int[] numVoo = new int[10], tipoAviao = new int[numVoo.length], capacidadeAviao = new int[numVoo.length], capacidadeAviaoInicial = new int[numVoo.length];
		double[] precoPassagem = new double[numVoo.length];
		
		for (int voo = 0; voo < numVoo.length; voo++) {
			numVoo[voo] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do voo:"));
			tipoAviao[voo] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de avião utilizado:"));
			precoPassagem[voo] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da passagem:"));
			
			if (tipoAviao[voo] == 707) {
				capacidadeAviao[voo] = 200;
				capacidadeAviaoInicial[voo] = capacidadeAviao[voo];				
			} else if (tipoAviao[voo] == 727) {
				capacidadeAviao[voo] = 170;
				capacidadeAviaoInicial[voo] = capacidadeAviao[voo];
			} else {
				capacidadeAviao[voo] = 120;				
				capacidadeAviaoInicial[voo] = capacidadeAviao[voo];				
			}
		}
		
		int identidadePassageiro, numVooDesejado;
		
		do {
			
			identidadePassageiro = Integer.parseInt(JOptionPane.showInputDialog("Identidade do passageiro: "));
			
			if (identidadePassageiro <= 0) {
				break;
			}
			
			numVooDesejado = Integer.parseInt(JOptionPane.showInputDialog("Número de voo desejado: "));
			
			boolean reservado = false;
			int index = 0;
			for (int voo = 0; voo < numVoo.length; voo++) {
				if (numVoo[voo] == numVooDesejado && capacidadeAviao[voo] > 0) {
					reservado = true;
					index = voo;
					break;
				}
			}
			if (reservado) {
				capacidadeAviao[index]--;
				JOptionPane.showMessageDialog(null, "Número da identidade do passageiro: " + identidadePassageiro
						+ "\nNúmero do voo desejado: " + numVooDesejado
						+ "\nPreço da passagem: R$: " + precoPassagem[index]
						+ "\nRESERVA CONFIRMADA");
			} else {
				JOptionPane.showMessageDialog(null, "Número da identidade do passageiro: " + identidadePassageiro
						+ "\nNúmero do voo desejado: " + numVooDesejado
						+ "\nVOO LOTADO");				
			}
			
		} while (identidadePassageiro > 0);
		
		String msg = "";
		int lucros = 0, prejuizos = 0;
		for (int voo = 0; voo < numVoo.length; voo++) {	
			if (capacidadeAviao[voo] < ((double) capacidadeAviaoInicial[voo] * 0.4)) {
				msg += numVoo[voo] + ": lucro.\n";
				lucros++;
			} else {
				msg += numVoo[voo] + ": prejuízo.\n";						
				prejuizos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, msg + "\nPrejuízos: " + prejuizos + "\nLucros: " + lucros);
		
	}

}
