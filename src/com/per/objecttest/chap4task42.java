package com.per.objecttest;

public class chap4task42 {

	static int[][] game;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game[3][3]=6;
		Object[] obj = game;
		//Cannot convert from String to int.
		game[3][3]="X";
		System.out.println(game[3][3]);
	}

}
