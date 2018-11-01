package br.com.bytebank.funcionario.model;

public abstract interface Autentica {

	public abstract boolean autentica(String senha);

	public abstract void setSenha(String senha);
}
