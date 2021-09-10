package com.per.listtest;

import java.util.ArrayList;


public class ListTest2 {
	
	ArrayList<StoreChars> chars;
	
	public ListTest2() {
		chars = new ArrayList<StoreChars>();
	}
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		ArrayList<StoreChars> chars = new ArrayList<StoreChars>();
		
		list.add('5');
		list.add('A');
		list.add('B');
		
		chars.add(new StoreChars((char) list.get(0)));
		chars.add(new StoreChars((char) list.get(1)));
		chars.add(new StoreChars((char) list.get(2)));

		System.out.println(chars);
	}

}
