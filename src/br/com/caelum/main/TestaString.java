package br.com.caelum.main;

public class TestaString {

	public static void main(String[] args) {
		String s = "Socorram-me, subi no ônibus	em\r\n" + "Marrocos";

		s = s.replaceAll("1", "2").toUpperCase().trim();

		if (s.isEmpty()) {
			System.out.println("A String esta vazia.");
		} else {
			System.out.println("A String é: " + s + " e sua quantidade é: " + s.length());
		}

		// String[] palavra = s.split(" ");

		for (int i = s.length(); i == 0; i--) {

			System.out.println(s.charAt(i));
		}

		StringBuilder nomes = new StringBuilder();

		System.out.println(nomes.append("Renato ").append("Jaqueline ").append("Roseli"));

	}

}
