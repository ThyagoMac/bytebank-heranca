package br.com.bytebank.model;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valorTributavel = t.getValorImposto();
		this.totalImposto += valorTributavel;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
