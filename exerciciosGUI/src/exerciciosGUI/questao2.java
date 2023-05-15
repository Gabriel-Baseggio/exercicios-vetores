package exerciciosGUI;

import javax.swing.JOptionPane;

public class questao2 {
	
	static float saldo;
	
	public static void main(String[] args) {
		
		definirSaldoInicial(1000);
		
		JOptionPane.showMessageDialog(null, "Saldo: R$" + saldo);
		sacar(500);		
		depositar(50);
		JOptionPane.showMessageDialog(null, "Saldo: R$" + saldo);
		sacar(600);
		JOptionPane.showMessageDialog(null, "Saldo: R$" + saldo);
		
	}
	
	static void definirSaldoInicial(float saldoInicial) {
		saldo = saldoInicial;
	}
	
	static void depositar(float valor) {
		saldo += valor;
	}
	
	static boolean sacar(float valor) {
		if (saldo >= valor) {			
			saldo -= valor;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			return false;
		}
	}

}
