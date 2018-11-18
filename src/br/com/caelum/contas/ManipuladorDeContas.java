package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;

import java.util.List;

import java.util.Collections;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {

		String tipo = evento.getSelecionadoNoRadio("tipo");

		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else {
			this.conta = new ContaPoupanca();
		}

		this.conta.setAgencia(evento.getString("agencia"));

		this.conta.setNumero(evento.getInt("numero"));

		this.conta.setTitular(evento.getString("titular"));

	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.setDeposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.setSaca(valor);
	}

	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}

	public void ordenaContas(Evento evento) {

		List<Conta> contas = evento.getLista("destino");
		Collections.reverse(contas);

	}

}
