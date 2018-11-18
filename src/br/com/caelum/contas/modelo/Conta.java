package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo = 0.00;
	private double limite;

	public boolean saca(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Valor não pode ser negativo," + "tente um valor positivo.");
		}

		if (valor > this.limite + this.saldo) {
			throw new SaldoInsuficienteException(valor);

		} else {
			System.out.println("Saque dentro do limite");
			this.saldo -= valor;
			return true;
		}

	}

	public void setDeposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor não pode ser negativo," + "tente um valor positivo.");
		} else {
			this.saldo += valor;
		}

	}

	public void setSaca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor não pode ser negativo," + "tente um valor positivo.");
		} else {
			this.saldo -= valor;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular.toUpperCase();
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.setSaca(valor);
		conta.setDeposita(valor);
	}

	public String recuperaDadosParaImpressao() {

		String dados = "Titular: " + this.titular.toUpperCase();
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\ntipo: " + this.getTipo();

		return dados;
	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "[Titular " + titular + ",numero " + numero + ",agencia " + agencia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	public int compareTo(Conta outraConta) {

		return this.titular.compareTo(outraConta.titular);

	}

}
