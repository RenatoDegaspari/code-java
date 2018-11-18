package br.com.caelum.pessoa;

public class FuncionarioAutenticavel extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			System.out.println("Acesso liberado.");
			return true;
		} else {
			System.out.println("Acesso negado.");
			return false;
		}

	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

}
