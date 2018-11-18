package br.com.caelum.main;

import java.util.HashMap;

import java.util.Map;

import br.com.caelum.contas.modelo.Conta;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.setDeposita(2000);

		Conta c2 = new ContaCorrente();
		c2.setDeposita(1000);

		Map<String, Conta> mapaDeContas = new HashMap<>();

		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		Conta contaDiretor = (Conta) mapaDeContas.get("diretor");

		Conta contaGerente = (Conta) mapaDeContas.get("gerente");

		System.out.println(contaDiretor.getSaldo());

		System.out.println(contaGerente.getSaldo());
	}

}
