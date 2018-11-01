package br.com.bytebank.model;

public class SistemaInterno {
	
	private String senhaInterna = "123456";

	public boolean autentica(Autentica a) {
		//this.senhaInterna = gerente.getSenha();
		if (a.autentica(senhaInterna)) {
			return true;
			
		} else {
			return false;
			
		}
	}
}
