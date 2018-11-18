package br.com.caelum.contas.modelo;

import java.util.ArrayList;

import java.util.List;

import br.com.caelum.pessoa.Funcionario;

public class Agencia {
	
	private List<Funcionario> empregados = new ArrayList<>();

	public List<Conta> buscaTodasContas() {

		ArrayList<Conta> contas = new ArrayList<>();

		return contas;

	}

	public void atualizaContas(List<Conta> contas) {

	}

	public List<Funcionario> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Funcionario> empregados) {
		this.empregados = empregados;
	}

}
