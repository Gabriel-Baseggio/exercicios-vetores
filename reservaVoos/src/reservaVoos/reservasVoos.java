package reservaVoos;

import javax.swing.JOptionPane;

public class reservasVoos {

	public static void main(String[] args) {
		
		int[] numVoo = new int[10], tipoAviao = new int[numVoo.length], capacidadeAviao = new int[numVoo.length], capacidadeAviaoInicial = new int[numVoo.length];
		double[] precoPassagem = new double[numVoo.length];
		
		for (int voo = 0; voo < numVoo.length; voo++) {
			numVoo[voo] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do voo:"));
			tipoAviao[voo] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de avi�o utilizado:"));
			precoPassagem[voo] = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o da passagem:"));
			
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
			
			numVooDesejado = Integer.parseInt(JOptionPane.showInputDialog("N�mero de voo desejado: "));
			
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
				JOptionPane.showMessageDialog(null, "N�mero da identidade do passageiro: " + identidadePassageiro
						+ "\nN�mero do voo desejado: " + numVooDesejado
						+ "\nPre�o da passagem: R$: " + precoPassagem[index]
						+ "\nRESERVA CONFIRMADA");
			} else {
				JOptionPane.showMessageDialog(null, "N�mero da identidade do passageiro: " + identidadePassageiro
						+ "\nN�mero do voo desejado: " + numVooDesejado
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
				msg += numVoo[voo] + ": preju�zo.\n";						
				prejuizos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, msg + "\nPreju�zos: " + prejuizos + "\nLucros: " + lucros);
		
	}

}
