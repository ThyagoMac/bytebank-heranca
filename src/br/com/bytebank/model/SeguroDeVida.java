package br.com.bytebank.model;

public class SeguroDeVida implements Tributavel {
	
	private double preco;
	
	public SeguroDeVida (double preco){
		this.preco = preco;
	}

	@Override
	public double getValorImposto() {
		return this.preco * 0.01;
	}

}
