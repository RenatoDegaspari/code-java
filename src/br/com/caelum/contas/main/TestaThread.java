package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Programa;

public class TestaThread {

	public static void main(String args[]) {

		/*
		 * Programa p1 = new Programa(); p1.setId(1);
		 * 
		 * Thread t1 = new Thread(p1); t1.start();
		 * 
		 * Programa p2 = new Programa(); p2.setId(2);
		 * 
		 * Thread t2 = new Thread(p2); t2.start();
		 */

		// Classe anônima
		/*
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 1000; i++) {
		 * System.out.println("Programa 1 valor: " + i);
		 * 
		 * }
		 * 
		 * } };
		 */

		// Lambda 1
		/*
		 * Runnable r = () -> { for (int i = 0; i < 1000; i++) {
		 * System.out.println("Programa 1  " + i); }
		 * 
		 * };
		 * 
		 * Thread t = new Thread(r); t.start();
		 */
        
		//Lambda 2
		new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Programa 1 " + i);
			}
		}).start();

	}
}
