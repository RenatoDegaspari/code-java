package br.com.caelum.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.caelum.contas.modelo.ComparadorPorTamanho;

public class comparador {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		lista.add("Sergio");
		lista.add("Paulo");
		lista.add("Guilherme");

		// Collections.sort(lista, comparador);

		// Isto é lambda. Defino os argumentos no método sort, depois indico como meus
		// argumentos devem ser comparados
		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// System.out.println(lista);

		lista.forEach(s -> System.out.println(s));

		lista.sort(Comparator.comparing(s -> s.length()));

		System.out.println(lista);

		// Filtra a lista onde os nomes tenham menos que 6 caracteres
		lista.stream().filter(s -> s.length() < 6).forEach(System.out::println);

		// A variável média recede a media do tamanho de caracteres que há na lista.
		OptionalDouble media = lista.stream().mapToInt(String::length).average();

		System.out.println(media.orElse(0));

		//O filtro permite listar mais de um resultado. Traz uma coleção de valores conforme filtro feito.
		List<String> resultado = lista.stream().filter(s -> s.length() < 8).collect(Collectors.toList());

		System.out.println(resultado);

	}

}
