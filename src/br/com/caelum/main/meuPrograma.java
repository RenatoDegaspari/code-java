package br.com.caelum.main;

import br.com.caelum.contas.modelo.GeraPDF;

public class meuPrograma {

	public static void main(String args[]) {

		GeraPDF geraPDF = new GeraPDF();

		Thread threadPDF = new Thread(geraPDF);

		threadPDF.start();
		
		

	}

}
