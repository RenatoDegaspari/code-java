package br.com.caelum.contas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;

public class RepositorioDeContas {

	public static final List<Conta> carrega = null;

	public void salva(List<Conta> Contas) {

		try {

			// Inicia o Arquivo
			PrintStream stream = new PrintStream("contas.txt");

			// Faz um loop adicionando as contas
			for (Conta conta : Contas) {

				stream.println(conta.getTipo() + ',' + conta.getNumero() + ',' + conta.getAgencia() + ','
						+ conta.getTitular() + ',' + conta.getSaldo());

			}

			stream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void carrega() throws IOException {

		// Obtenho o byte através do arquivo
		InputStream is;
		try {
			is = new FileInputStream("contas.txt");

			// Obtenho o char
			InputStreamReader isr = new InputStreamReader(is);

			// Obtenho a String
			BufferedReader br = new BufferedReader(isr);

			String s = br.readLine(); // primeira linha;

			while (s != null) {

				String[] valores = s.split(",");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
