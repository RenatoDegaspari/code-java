package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class TestaList {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.setDeposita(1000);

		ContaCorrente c2 = new ContaCorrente();
		c2.setDeposita(2000);

		ContaCorrente c3 = new ContaCorrente();
		c3.setDeposita(8000);

		List<ContaCorrente> contas = new LinkedList();

		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		Random gerador = new Random();

		for (int i = 0; i < contas.size(); i++) {

			String agencia = Integer.toString(gerador.nextInt(26));

			ContaCorrente cc = contas.get(i);

			cc.setAgencia(agencia);

			System.out.println(cc.getAgencia());

			System.out.println(cc.getSaldo());

			System.out.println(cc.compareTo(c3)); // Ordenar o saldo, apresenta 0,1 e -1

			System.out.println("------------------------------------------");
		}

		List<String> lista = new ArrayList<>();

		lista.add("Renato");
		lista.add("Jaqueline");
		lista.add("Walter");

		System.out.println("Sem ordenação");

		System.out.println(lista);

		Collections.sort(lista);

		System.out.println("Com ordenação");

		System.out.println(lista);

	}

}
