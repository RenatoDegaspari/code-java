package br.com.caelum.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjunto {

	public static void main(String args[]) {

		Set<String> cargos = new HashSet<>();

		cargos.add("Analista");
		cargos.add("Programador");
		cargos.add("Tester");
		cargos.add("Diretor");
		cargos.add("Analista");

		Iterator<String> i = cargos.iterator();

		while (i.hasNext()) {

			String palavra = i.next();
			System.out.println(palavra);

		}

	}

}
