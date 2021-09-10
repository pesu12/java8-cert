package wordTest;

import java.util.Arrays;
import java.util.Scanner;

public class WordTestMain {

	// WordTest program
	// Take a sentence and add them in their word category

	static StringBuilder sb;
	static Inventory i = new Inventory();

	public static void main(String[] args) {

		// Get word String
		try {
			sb = new StringBuilder(getWord());
		} catch (NullLengthExcpetion e) {
			e.printStackTrace();
		} finally {
			System.out.println("Enter sentence done.");
		}

		extractAndAddWords(sb);

		// Display words
		i.displayInventory();
	}

	private static void extractAndAddWords(StringBuilder sb2) {
		// TODO Auto-generated method stub
		// Extract First and add it to the class
		String[] elements = sb2.toString().split(" ");
		String first = elements[0];
		String[] trailing = Arrays.copyOfRange(elements, 1, elements.length);

		try {
			if (first.length() == 0) {
				throw new NullLengthExcpetion("Length is null");
			}
		} catch (NullLengthExcpetion e) {
			e.printStackTrace();
		}
		
		WordNoun n = new WordNoun(new StringBuilder(first));
		i.addWord(n);

		WordVerb v = new WordVerb(new StringBuilder(trailing[0]));
		i.addWord(v);
	}

	private static StringBuilder getWord() throws NullLengthExcpetion {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		StringBuilder name = new StringBuilder(in.nextLine());
		in.close();
		if (name.length() == 0) {
			throw new NullLengthExcpetion("Length is null");
		}
		return name;
	}
}
