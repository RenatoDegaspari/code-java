package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Banco {

	private String nome;

	private int numero;

	// private Conta[] conta;

	private List contas = new ArrayList<Conta>();

	private Map<String, Conta> conta = new HashMap<>();

	public Banco(String nome, int numero) {

		this.setNome(nome);
		this.setNumero(numero);
		// this.conta = new ContaCorrente[10];

	}

	public void adiciona(ContaCorrente c) {

		if (this.conta.containsKey(c.getTitular())) {
			System.out.println("Nome já informado");
		}
		{
			this.conta.put(c.getTitular(), c);
		}

	}

	public void buscaPorTitular(String nome) {

		System.out.println(this.conta.get(nome));

	}

	/*
	 * public void MostraContas() {
	 * 
	 * for (int i = 0; i < conta.length; i++) {
	 * 
	 * System.out.println("A conta na posição " + i + " é " + getNome() + " saldo "
	 * + conta[i].getSaldo()); } }
	 * 
	 * @SuppressWarnings({ "unused", "unlikely-arg-type" }) public boolean
	 * validaConta(ContaCorrente c) {
	 * 
	 * for (int i = 0; i < conta.length; i++) {
	 * 
	 * if (this.conta.equals(c.getNumero())) { return true; } else { return false; }
	 * 
	 * } return false;
	 * 
	 * }
	 */

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List getContas() {
		return contas;
	}

	public void setContas(Object contas) {

		this.contas.add(contas);

	}

	public int pegaQuantidadeDeContas() {

		return this.contas.size();

	}

}
