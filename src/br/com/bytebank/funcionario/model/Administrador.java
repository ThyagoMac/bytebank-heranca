package br.com.bytebank.funcionario.model;

public class Administrador extends Funcionario implements Autentica  {
	
	private AutenticadorUtil autenticador;

	public Administrador(String nome, String cpf) {
		super(nome, cpf);
		autenticador = new AutenticadorUtil(); 
	}

	@Override
	public double calculaBonificacao() {
		return super.getSalario() + 666.0;
	}
	@Override
	public boolean autentica(String senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public void setSenha(String senha) {
		autenticador.setSenha(senha);
	}

}
