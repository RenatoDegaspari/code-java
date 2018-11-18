package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;



	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.titular;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return this.numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return this.valor;
	}

	public void imprimeArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("Posição do array é: " + array[i]);

		}
	}

}
