package br.com.bytebank.funcionario.model;

public class AutenticadorUtil {

	private String senha;

	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
