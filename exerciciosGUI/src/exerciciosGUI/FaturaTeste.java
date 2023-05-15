package exerciciosGUI;

import javax.swing.JOptionPane;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Fatura mouse = new Fatura("1", "Mouse", 10, 30.0);
		Fatura teclado = new Fatura("2", "Teclado", 20, 100.0);
		Fatura monitor = new Fatura("3", "Monitor", 30, 2500.0);
		Fatura cadeira = new Fatura("4", "Cadeira", 25, 200.0);
		Fatura computador = new Fatura("5", "Computador", 5, 5000.0);
		
		JOptionPane.showMessageDialog(null, "Número: " + mouse.getNumero() + "\nDescrição: " + mouse.getDescricao() + "\nQuantidade comprada: " + mouse.getQtdComprada() + "\nPreço por item: R$" + mouse.getPrecoPorItem() + "\nTotal fatura: R$" + mouse.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + teclado.getNumero() + "\nDescrição: " + teclado.getDescricao() + "\nQuantidade comprada: " + teclado.getQtdComprada() + "\nPreço por item: R$" + teclado.getPrecoPorItem() + "\nTotal fatura: R$" + teclado.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + monitor.getNumero() + "\nDescrição: " + monitor.getDescricao() + "\nQuantidade comprada: " + monitor.getQtdComprada() + "\nPreço por item: R$" + monitor.getPrecoPorItem()  + "\nTotal fatura: R$" + monitor.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + cadeira.getNumero() + "\nDescrição: " + cadeira.getDescricao() + "\nQuantidade comprada: " + cadeira.getQtdComprada() + "\nPreço por item: R$" + cadeira.getPrecoPorItem()  + "\nTotal fatura: R$" + cadeira.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + computador.getNumero() + "\nDescrição: " + computador.getDescricao() + "\nQuantidade comprada: " + computador.getQtdComprada() + "\nPreço por item: R$" + computador.getPrecoPorItem()  + "\nTotal fatura: R$" + computador.getTotalFatura());
	
	}

}
