package br.com.bytebank.model;

public class PolimorfismoBonificacoes {

	private double soma;

	public void registraBonificacao(Funcionario funcionario) {
		this.soma = this.soma + funcionario.calculaBonificacao();
	}

	public double getSoma() {
		return soma;
	}
	
	
}
