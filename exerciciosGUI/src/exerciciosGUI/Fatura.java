package exerciciosGUI;

public class Fatura {

	private String numero, descricao;
	private int qtdComprada;
	private double precoPorItem;
	
	public Fatura(String numero, String descricao, int qtdComprada, double precoPorItem) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qtdComprada = qtdComprada;
		this.precoPorItem = precoPorItem;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdComprada() {
		return qtdComprada;
	}

	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}

	public double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = precoPorItem;
	}
	
	public double getTotalFatura() {
		if (this.qtdComprada * this.precoPorItem > 0) {
			return this.qtdComprada * this.precoPorItem;			
		} else {
			return 0.0;
		}
	}
	
}
