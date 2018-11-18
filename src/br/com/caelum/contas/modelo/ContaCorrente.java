package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void setSaca(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Valor negativo. Informe um valor válido.");
		} else {
			if (this.saldo < valor) {
				throw new SaldoInsuficienteException(valor);
			}

			this.saldo -= (valor + 0.10);
		}

	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 2;
	}

	@Override
	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int compareTo(ContaCorrente outra) {

		if (this.saldo < outra.saldo) {
			return -1;
		}

		if (this.saldo > outra.saldo) {
			return 1;
		}

		return 0;

	}

}
