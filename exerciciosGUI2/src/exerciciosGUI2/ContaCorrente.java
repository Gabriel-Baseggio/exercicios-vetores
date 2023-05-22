package exerciciosGUI2;

public class ContaCorrente {
	
	private double saldo;
	private double taxaOperacao;
	
	public ContaCorrente() {
		setTaxaOperacao(0.995);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	
	public double getTaxaOperacao() {
		return taxaOperacao;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String depositar(double valor) {
		this.saldo += valor;
		return "Depósito concluído!";
	}

	public String sacar(double valor) {
		if (saldo < valor) {
			return "Saldo insuficiente!";
		}
		this.saldo -= valor;
		return "Saque concluído! Valor sacado: R$" + (valor * taxaOperacao);
	}
	
}
