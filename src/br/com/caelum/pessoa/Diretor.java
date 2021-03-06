package br.com.caelum.pessoa;

public class Diretor extends FuncionarioAutenticavel implements Autenticavel {

	private int senha;

	public boolean autentica(int senha) {

		if (senha == this.senha) {
			System.out.println("Acesso liberado.");
			return true;
		} else {
			System.out.println("Acesso negado.");
			return false;
		}

	}

	@Override
	public double getBonificacao() {

		return this.salario * 1.2 + 1000;
	}

}
