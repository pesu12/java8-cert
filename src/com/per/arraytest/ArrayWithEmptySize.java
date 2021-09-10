package com.per.arraytest;

public class ArrayWithEmptySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] array3D = new int[2][][];
		array3D[0] = new int[5][];
		array3D[1]= new int[3][];
		array3D[0][0] = new int[7];
		array3D[0][1] = new int[2];
		array3D[0][1][1]=5;
		System.out.println(array3D[0]);
		System.out.println(array3D[0][1]);	
		array3D[0][1][1]=5;
		System.out.println(array3D[0][1][1]);	
	}

}
