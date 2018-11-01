package br.com.bytebank.test;
import br.com.bytebank.model.Funcionario;
import br.com.bytebank.model.Gerente;
import br.com.bytebank.model.PolimorfismoBonificacoes;
import br.com.bytebank.model.Porteiro;

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
		Funcionario p2 = new Porteiro("Jessica","888.888.888-88");
		p2.setSalario(1100);
		
		PolimorfismoBonificacoes bonifi = new PolimorfismoBonificacoes();

//		bonifi.registraBonificacao(f1);
//		bonifi.registraBonificacao(f2);
		bonifi.registraBonificacao(g1);
		bonifi.registraBonificacao(p1);

//		System.out.println("Nome: " + f1.getNome() + " CPF: " + f1.getCpf() + " Salario: " + f1.getSalario()
//				+ " Bonificação: " + f1.calculaBonificacao());
//		System.out.println("Nome: " + f2.getNome() + " CPF: " + f2.getCpf() + " Salario: " + f2.getSalario()
//				+ " Bonificação: " + f2.calculaBonificacao());
		System.out.println("Nome: " + p1.getNome() + " CPF: " + p1.getCpf() + " Salario: " + p1.getSalario()
				+ " Bonificação: " + p1.calculaBonificacao());
		System.out.println("Nome: " + p2.getNome() + " CPF: " + p2.getCpf() + " Salario: " + p2.getSalario()
		+ " Bonificação: " + p2.calculaBonificacao());
		System.out.println("Nome: " + g1.getNome() + " CPF: " + g1.getCpf() + " Salario: " + g1.getSalario()
				+ " Bonificação: " + g1.calculaBonificacao());
		System.out.println("Senha está: " + g1.autentica("c222"));
		System.out.println("Senha está: " + g1.autentica("222"));
		System.out.println("Total de funcionarios: " + Funcionario.totalFuncionario);
		System.out.println("Total de bonificações: " + bonifi.getSoma());
	}
}
