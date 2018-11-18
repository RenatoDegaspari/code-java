package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String args[]) {

		double nSoma = 0;

		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {

			ContaCorrente Cc = new ContaCorrente();

			contas[i] = Cc;

			contas[i].setDeposita(i * 100);

			nSoma = nSoma + contas[i].getSaldo();

			System.out.println("O saldo de conta da posição " + i + " é " + contas[i].getSaldo());

		}

		System.out.println("A média dos saldos é de " + nSoma / contas.length);

	}

}
