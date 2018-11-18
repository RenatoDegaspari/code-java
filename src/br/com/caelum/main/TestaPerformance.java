package br.com.caelum.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class TestaPerformance {

	public static void main(String args[]) {
		System.out.println("Iniciando....");

		Collection<Integer> teste = new HashSet<>();

		long inicio = System.currentTimeMillis();

		int total = 3000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		long fim = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long tempo = fim - inicio;

		System.out.println("Tempo gasto: " + tempo);

	}

}
