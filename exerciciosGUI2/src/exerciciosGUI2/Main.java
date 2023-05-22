package exerciciosGUI2;


import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		ContaCorrenteEspecial contaE = new ContaCorrenteEspecial();
		int opcao, func;
		double valor;
		
		do {			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Tipo de conta: \n1 - Comum \n2 - Especial \n0 - Sair"));
			switch (opcao) {
			case 1:
				do {
					func = Integer.parseInt(JOptionPane.showInputDialog("O que você quer fazer? \n1 - Depositar \n2 - Sacar \n3 - Mostrar saldo \n0 - Sair"));
					
					switch (func) {
					case 1:
						valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar?"));
						JOptionPane.showMessageDialog(null, conta.depositar(valor));
						break;
					case 2:
						valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar?"));
						JOptionPane.showMessageDialog(null, conta.sacar(valor));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Saldo: R$" + conta.getSaldo());
						break;
					case 0:
						JOptionPane.showMessageDialog(null, "Saindo!");
						break;
					default: 
						JOptionPane.showMessageDialog(null, "Opção incorreta!");
					}					
				} while(func != 0);
				break;
			case 2 :
				do {
					func = Integer.parseInt(JOptionPane.showInputDialog("O que você quer fazer? \n1 - Depositar \n2 - Sacar \n3 - Mostrar saldo \n0 - Sair"));
					
					switch (func) {
					case 1:
						valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar?"));
						JOptionPane.showMessageDialog(null, contaE.depositar(valor));
						break;
					case 2:
						valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar?"));
						JOptionPane.showMessageDialog(null, contaE.sacar(valor));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Saldo: R$" + contaE.getSaldo());
						break;
					case 0:
						JOptionPane.showMessageDialog(null, "Saindo!");
						break;
					default: 
						JOptionPane.showMessageDialog(null, "Opção incorreta!");
					}					
				} while(func != 0);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo!");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Opção incorreta!");
			}
		} while (opcao != 0);
	}

}
