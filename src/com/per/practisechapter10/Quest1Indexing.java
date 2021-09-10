package com.per.practisechapter10;

public class Quest1Indexing {

	public static void main(String... books) {
		
		//Stringbuilder gives Runtime exception since initialization of sb is done but 
		//no value exists for sb when doing indexof....
		/*
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(String book: books) 
			sb.insert(sb.indexOf("c"), book);
		System.out.println(sb);
		*/
		
		//Stringbuilder is used before been initialized => Compile error
	//	StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots");
		//System.out.println(sb);
	}

}
