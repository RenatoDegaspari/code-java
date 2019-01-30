package br.com.caelum.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String args[]) throws IOException {

		// Obtenho o byte através do arquivo
		// InputStream is = new FileInputStream("arquivo.txt");

		InputStream is =  System.in;

		// Obtenho o char
		InputStreamReader isr = new InputStreamReader(is);

		// Obtenho a String
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha

		while (s != null) {

			System.out.println(s);

			s = br.readLine();
		}

	}

}
