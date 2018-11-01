package br.com.bytebank.test;

import br.com.bytebank.model.CalculadorImposto;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;
import br.com.bytebank.model.SeguroDeVida;

public class TestConta {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaPoupanca cp1  = new ContaPoupanca(111, 222);
		SeguroDeVida sv = new SeguroDeVida(100.0);
		CalculadorImposto calc = new CalculadorImposto();

		cc1.deposita(110.0);
		cp1.deposita(220.0);
		
		cc1.transfere(10.0, cp1);
		
		System.out.println("Saldo cc1: " + cc1.getSaldo());
		System.out.println("Saldo cp1: " + cp1.getSaldo());
		
		cc1.saca(1000);
		System.out.println("Saldo cc1: " + cc1.getSaldo());

		cc1.saca(10);
		System.out.println("Saldo cc1: " + cc1.getSaldo());
		
		cc1.deposita(10.4);
		
		calc.registra(sv);
		calc.registra(cc1);
		
		System.out.println("Total de Impostos: " + calc.getTotalImposto());
	}

}
