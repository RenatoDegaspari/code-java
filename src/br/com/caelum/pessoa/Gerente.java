package br.com.caelum.pessoa;

public class Gerente extends FuncionarioAutenticavel implements Autenticavel{

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso liberado.");
			return true;
		} else {
			System.out.println("Acesso negado.");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
     
	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

}
