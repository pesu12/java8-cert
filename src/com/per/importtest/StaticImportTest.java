package com.per.importtest;

import static java.util.Locale.ENGLISH;

public class StaticImportTest {

	
	
	public static void main(String[] args) {
		System.out.println("Locale: " + ENGLISH);
		//System.out.println("Locale: " + ITALY); Will not work since ITALY static variable is not imported.
	}

}
