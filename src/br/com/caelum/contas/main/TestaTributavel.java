package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.ValorInvalidoException;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();

		try {
			cc.setDeposita(100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		ContaPoupanca cp = new ContaPoupanca();

		try {
			cp.setDeposita(100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			try {
				cc.setSaca(50);
				System.out.println("Consegui sacar da Conta Corrente.");
			} catch (IllegalArgumentException  | ValorInvalidoException e) { // isso é foda
				System.out.println(e.getMessage());
			}

			cp.saca(50);
			System.out.println("Consegui sacar da Conta Poupança.");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * System.out.println(cc.getValorImposto());
		 * 
		 * Tributavel t = cc;
		 * 
		 * System.out.println(t.getValorImposto());
		 * 
		 * try { cc.saca(200); } catch (IllegalArgumentException e) {
		 * System.out.println(e.getMessage()); }
		 */

	}

}
