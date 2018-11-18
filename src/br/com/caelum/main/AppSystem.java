package br.com.caelum.main;

import java.io.PrintStream;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.Conta;

public class AppSystem {

	public static void main(String[] args) {

		Conta[] minhasContas = new Conta[10];

		minhasContas[0] = new ContaCorrente();

		minhasContas[1] = new ContaPoupanca();

		System.out.println("O saldo é de " + minhasContas[1].getSaldo());

		// System.getProperties().list(System.out);

		// System.out.println(System.getProperty("java.runtime.version"));

		PrintStream saida = System.out;
		saida.println("Olá");

		String x = new String("fj11");
		String y = new String("fj11");

		if (x == y) {
			System.out.println("Referencia para o mesmo objeto!");
		} else {
			System.out.println("Referencia para objetos diferentes!");
		}

		if (x.equals(y)) {
			System.out.println("Consideramos iguais	no critério	de igualdade");
		} else {
			System.out.println("Consideramos diferentes	no critério	de igualdade");
		}

		int total = 5;

		System.out.println("O valor total é: " + total);

		String palavra = "fj11";
		palavra = palavra.toUpperCase().replace("1", "2");
		System.out.println(palavra);

	}

}
