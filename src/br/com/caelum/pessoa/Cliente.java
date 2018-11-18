package br.com.caelum.pessoa;

public class Cliente implements Autenticavel {

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

}
