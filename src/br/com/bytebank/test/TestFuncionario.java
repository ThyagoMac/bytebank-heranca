package br.com.bytebank.test;

import br.com.bytebank.model.Administrador;
import br.com.bytebank.model.Cliente;
import br.com.bytebank.model.Funcionario;
import br.com.bytebank.model.Gerente;
import br.com.bytebank.model.PolimorfismoBonificacoes;
import br.com.bytebank.model.Porteiro;
import br.com.bytebank.model.SistemaInterno;

public class TestFuncionario {

	public static void main(String[] args) {

//		A classe Funcionario se tornou abstract
//		Funcionario f2 = new Funcionario("Sr.Pickles", "222.222.222-22");
//		f2.setSalario(1400.0);
//		Funcionario f1 = new Funcionario("Rick", "000.000.000-00");
//		f1.setSalario(1500.0);

		Gerente g1 = new Gerente("Paul", "333.333.333-33");
		g1.setSenha("c222");
		g1.setSalario(2000);

		Porteiro p1 = new Porteiro("Ronaldo", "999.999.999-99");
		p1.setSalario(1000);
		Funcionario p2 = new Porteiro("Jessica", "888.888.888-88");
		p2.setSalario(1100);

		SistemaInterno si = new SistemaInterno();
		if (si.autentica(g1))
			System.out.println("Usuario " + g1.getNome() + " foi autenticado.");
		else
			System.out.println("Senha invalida.");

		g1.setSenha("123456");

		if (si.autentica(g1))
			System.out.println("Usuario " + g1.getNome() + " foi autenticado.");
		Administrador a1 = new Administrador("Mandao", "456.987.312-45");
		a1.setSenha("123456");
		a1.setSalario(5000);

		if (si.autentica(a1))
			System.out.println("Usuario " + a1.getNome() + " foi autenticado.");

		Cliente c1 = new Cliente("Guen", "666.456.456-99", "123456");
		if (si.autentica(c1))
			System.out.println("Cliente " + c1.getNome() + " foi autenticado.");

		PolimorfismoBonificacoes bonifi = new PolimorfismoBonificacoes();

//		bonifi.registraBonificacao(f1);
//		bonifi.registraBonificacao(f2);
		bonifi.registraBonificacao(g1);
		bonifi.registraBonificacao(p1);

//		System.out.println("Nome: " + f1.getNome() + " CPF: " + f1.getCpf() + " Salario: " + f1.getSalario()
//				+ " Bonificacao: " + f1.calculaBonificacao());
//		System.out.println("Nome: " + f2.getNome() + " CPF: " + f2.getCpf() + " Salario: " + f2.getSalario()
//				+ " Bonificacao: " + f2.calculaBonificacao());
		System.out.println("Nome: " + p1.getNome() + " CPF: " + p1.getCpf() + " Salario: " + p1.getSalario()
				+ " Bonificacao: " + p1.calculaBonificacao());
		System.out.println("Nome: " + p2.getNome() + " CPF: " + p2.getCpf() + " Salario: " + p2.getSalario()
				+ " Bonificacao: " + p2.calculaBonificacao());
		System.out.println("Nome: " + g1.getNome() + " CPF: " + g1.getCpf() + " Salario: " + g1.getSalario()
				+ " Bonificacao: " + g1.calculaBonificacao());
		System.out.println("Nome: " + a1.getNome() + " CPF: " + a1.getCpf() + " Salario: " + a1.getSalario()
				+ " Bonificacaoo: " + a1.calculaBonificacao());
		System.out.println("Nome: " + c1.getNome() + " CPF: " + c1.getCpf() + " Profissao: " + c1.getProfissao());

		System.out.println("Senha esta: " + g1.autentica("c222"));
		System.out.println("Senha esta: " + c1.autentica("123456"));
		System.out.println("Total de funcionarios: " + Funcionario.totalFuncionario);
		System.out.println("Total de bonificacoes: " + bonifi.getSoma());
	}
}
