package br.com.caelum.main;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileReader;

public class TestaSaida {

	public static void main(String args[]) throws Exception {

		OutputStream os = new FileOutputStream("saida.txt", true);

		OutputStreamWriter osw = new OutputStreamWriter(os);

		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Caelum 2");

		bw.newLine();

		bw.close();

	}

}
