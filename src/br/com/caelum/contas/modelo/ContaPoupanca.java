package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		return "Conta Poupan�a";
	}

	@Override
	public void setSaca(double valor) {
		this.saldo -= valor;
	}

}
