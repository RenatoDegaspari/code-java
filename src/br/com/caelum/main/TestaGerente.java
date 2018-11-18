package br.com.caelum.main;

import br.com.caelum.pessoa.Gerente;

public class TestaGerente {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		gerente.setNome("Renato");

		System.out.println("O nome do gerente eh " + gerente.getNome());

		gerente.setSalario(5000.0);

		System.out.println("A bonificação do gerente eh " + gerente.getBonificacao());
		
	}
	
	

}
