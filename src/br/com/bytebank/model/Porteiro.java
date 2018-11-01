package br.com.bytebank.model;

public class Porteiro extends Funcionario {

	private String cracha;

	public double calculaBonificacao() {
		return super.getSalario() + 11;
	}

	public Porteiro(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}

}
