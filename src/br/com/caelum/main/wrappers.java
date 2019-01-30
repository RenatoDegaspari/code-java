package br.com.caelum.main;

import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

public class wrappers {

	public static void main(String[] args) {

		int i = 100;
		String s = "" + i;

		System.out.println(s);

		double d = 1.2;
		String s2 = "" + d;

		System.out.println(s2);

		String s3 = "101";
		int j = Integer.parseInt(s3);

		System.out.println(j);

		Integer x = 5;

		int y = x;
		
		System.out.println(y);
		
		Object o = 5;
		
		System.out.println(o);

	}

}
