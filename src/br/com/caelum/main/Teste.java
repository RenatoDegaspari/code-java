package br.com.caelum.main;

import java.io.FileNotFoundException;

public class Teste {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
