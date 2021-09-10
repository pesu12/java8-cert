package com.per.practisechapter10;

import java.util.*;

public class Quest41Museums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Natural History","Science","Art"};
		List<String> museums = Arrays.asList(array);
		//Not allowed to do add or remove due to that it affects Array that has a fixed size.
		//museums.remove(2);
		System.out.println(museums);
		
		List<String> museums2 = new ArrayList<String>();	
		museums2.add("Test");
		museums2.remove(0);
	}

}
