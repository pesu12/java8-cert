package com.per.operatorpredancetest;

public class Predancetest {

	public static void main(String[] args) {
		int leaders = 10* (2+(1+2/5));
		int followers = leaders * 2;
		System.out.println(leaders + followers < 10 ? "Too few": "Too many");
		int x = 4+ 5/5;
		System.out.println(x);
		
		Integer x1 = Integer.parseInt("5");
		Integer x2 = Integer.valueOf("4");
		System.out.println(x1 + " " +  x2);
	}

}
