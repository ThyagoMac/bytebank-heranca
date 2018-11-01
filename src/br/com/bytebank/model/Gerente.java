package br.com.bytebank.model;

public class Gerente extends Funcionario {

	private String senha;

	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double calculaBonificacao() {
		return super.getSalario() * 0.5;
	}

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
