package exerciciosGUI;

import javax.swing.JOptionPane;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Fatura mouse = new Fatura("1", "Mouse", 10, 30.0);
		Fatura teclado = new Fatura("2", "Teclado", 20, 100.0);
		Fatura monitor = new Fatura("3", "Monitor", 30, 2500.0);
		Fatura cadeira = new Fatura("4", "Cadeira", 25, 200.0);
		Fatura computador = new Fatura("5", "Computador", 5, 5000.0);
		
		JOptionPane.showMessageDialog(null, "N�mero: " + mouse.getNumero() + "\nDescri��o: " + mouse.getDescricao() + "\nQuantidade comprada: " + mouse.getQtdComprada() + "\nPre�o por item: R$" + mouse.getPrecoPorItem() + "\nTotal fatura: R$" + mouse.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + teclado.getNumero() + "\nDescri��o: " + teclado.getDescricao() + "\nQuantidade comprada: " + teclado.getQtdComprada() + "\nPre�o por item: R$" + teclado.getPrecoPorItem() + "\nTotal fatura: R$" + teclado.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + monitor.getNumero() + "\nDescri��o: " + monitor.getDescricao() + "\nQuantidade comprada: " + monitor.getQtdComprada() + "\nPre�o por item: R$" + monitor.getPrecoPorItem()  + "\nTotal fatura: R$" + monitor.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + cadeira.getNumero() + "\nDescri��o: " + cadeira.getDescricao() + "\nQuantidade comprada: " + cadeira.getQtdComprada() + "\nPre�o por item: R$" + cadeira.getPrecoPorItem()  + "\nTotal fatura: R$" + cadeira.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + computador.getNumero() + "\nDescri��o: " + computador.getDescricao() + "\nQuantidade comprada: " + computador.getQtdComprada() + "\nPre�o por item: R$" + computador.getPrecoPorItem()  + "\nTotal fatura: R$" + computador.getTotalFatura());
	
	}

}
