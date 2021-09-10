package com.per.objecttest;

public class chap4task28 {

	static int[][] game = new int[6][6];

	public static void main(String[] args) {
		
		game[3][3]=6;
		Object[] obj = game;
		//Gives ArrayStoreException
		obj[3]="X";
		System.out.println(game[3][3]);
	}

}
