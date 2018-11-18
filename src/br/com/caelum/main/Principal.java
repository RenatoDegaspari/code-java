package br.com.caelum.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();

		conta.setDeposita(100.00);

		conta.setTitular("Renato");

		conta.setAgencia("0207");

		conta.setNumero(010655561);

		System.out.println("O saldo é de " + conta.getSaldo());

		System.out.println(conta);
	}
}
