package examquest1;

import java.util.Arrays;

public class indexing {

	public indexing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] books = {"cars","carts"};
		Integer[] numbers = new Integer[4];
		StringBuilder sb = new StringBuilder();
		for(String book:books)
			sb.insert(sb.indexOf("c"),book);
		System.out.println(sb);
		System.out.println(Arrays.toString(books));
		System.out.println(Arrays.toString(numbers));
	}
	
}
