package br.com.bytebank.model;

public class Cliente implements Autentica {

	private String nome;
	private String cpf;
	private String profissao;

	private AutenticadorUtil autenticador;

	public Cliente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.autenticador = new AutenticadorUtil();
		this.setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(String senha) {
		autenticador.setSenha(senha);		
	}

}
