package br.com.caelum.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta");

		Socket cliente = servidor.accept();

		System.out.println("Nova Conexão com o cliente " + cliente.getInetAddress().getHostAddress());

		Scanner s = Scanner(cliente.getInputStream());

		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}

		s.close();
		cliente.close();
		servidor.close();

	}

	private static Scanner Scanner(InputStream inputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
