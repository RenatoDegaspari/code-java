package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {

		List<Conta> conta = new ArrayList<>();

		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();

		conta.add(c1);
		conta.add(c2);
		conta.add(c3);

		for (int i = 0; i < conta.size(); i++) {

			ContaCorrente cc = (ContaCorrente) conta.get(i);

		}

	}

}
