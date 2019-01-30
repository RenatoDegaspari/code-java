package br.com.caelum.contas.modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeraPDF implements Runnable {

	public void run() {

		Document document = new Document();

		try {

			PdfWriter.getInstance(document, new FileOutputStream("C://Temp"));
			document.open();

			document.add(new Paragraph("Gerando Parágrafo no PDF em Java"));

		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		document.close();

	}

}
