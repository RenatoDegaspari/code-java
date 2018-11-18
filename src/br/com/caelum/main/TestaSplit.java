package br.com.caelum.main;

public class TestaSplit {

	public static void main(String Arg[]) {

		String frase = "Marrocos em ônibus no subi Socorram-me,";

		String[] palavras = frase.split(" ");

		String mensagem = "teste";

		for (int i = palavras.length; i == 0; i--) {

			mensagem = mensagem + palavras[i];

		}

		System.out.println(mensagem);

	}

}
