package br.com.caelum.main;

import br.com.caelum.contas.modelo.SeguroDeVida;;

public class PercorreArray {

	public static void main(String[] args) {

		int[] idades = new int[10];

		for (int i = 0; i < 10; i++) {

			idades[i] = i * 10;

		}

		for (int x : idades) {

			System.out.println("Os valores de idades são: " + x);

		}

		SeguroDeVida oArray = new SeguroDeVida();

		oArray.imprimeArray(idades);

	}

}
