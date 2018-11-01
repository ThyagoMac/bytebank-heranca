package br.com.bytebank.funcionario.model;

//abstract nao pode ser instanciado
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	public static int totalFuncionario;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		totalFuncionario++;
	}

	
	//Abstract Obriga aos filhos criarem o metodo calculaBonificacao
	public abstract double calculaBonificacao();
	
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
