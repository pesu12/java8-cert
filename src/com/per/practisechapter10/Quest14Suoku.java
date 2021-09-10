package com.per.practisechapter10;

public class Quest14Suoku {

	static int[][] game;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//game = new int[4][4]  when missing this we get a null-pointer exception.
		game[3][3]=6;
		Object [] obj = game;
		obj[3]= 'X';
		System.out.println(game[3][3]);
	}
}
