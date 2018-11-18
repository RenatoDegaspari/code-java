package br.com.caelum.main;

import java.util.List;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String args[]) {

		Banco b = new Banco("CaelumBank", 999);

		for (int i = 0; i < 5; i++) {

			ContaCorrente c = new ContaCorrente();

			c.setTitular("Batman" + i);
			c.setAgencia("0207" + i);
			c.setNumero(0);

			// System.out.println(b.validaConta(c));

			c.setDeposita(1000 * i);
		

			b.adiciona(c);
		}

		b.buscaPorTitular("BATMAN1");

		// b.MostraContas();

		// System.out.println(b.pegaQuantidadeDeContas());

	}

}
