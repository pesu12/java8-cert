package com.per.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList <String>l1= new ArrayList<>();
		l1.add("Hello");
		l1.add("Test");		
		String[] s1 = l1.toArray(new String[l1.size()]);
		System.out.println(Arrays.toString(s1));
        l1.remove(new String("Hello"));
		System.out.println(l1);
		l1.add("Per");
		System.out.println(l1);
		l1.clear();
		System.out.println(l1.size());
		
		//----------------------------------
		String[] petsArray ={"dog","cat","parrot"};
		List<String> petsList = Arrays.asList(petsArray);
		petsList.set(0, "bird"); //String is affected as well
		System.out.println(petsList);
		System.out.println(Arrays.toString(petsArray));
		
		petsArray[0] = "husky";  //Affects list as well.
		Collections.sort(petsList);
		System.out.println(petsList);
		Arrays.toString(petsArray);
		
		//petsList.add("newdog"); //Not allowed unsupportedOperationException
		//petsList.remove(1); //Not allowed unsupportedOperationException	
		
		
		//Sorting
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("9");
		stringList.add("10");
		Collections.sort(stringList);
		System.out.println(stringList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(9);
		intList.add(10);
		Collections.sort(intList);
		System.out.println(intList);
		
		//ArrayTest
		int[][] scores = new int[5][]; //valid
		String[] lion = new String[] {"lion"}; //valid
		int[] []test = new int[5][5];
		int test2[][] = new int[5][5];	//valid	
		int[] test3[] = new int[5][5];	//valid	
		//[]int[] test = new int[5]; //not valid
		//int[] scores = new int[]; //not valid
		//String beans = new beans[6]; //Not valid
		
		String test4[] = new String[]{"Test5"};
		
		//Remove test
		ArrayList <String>l2= new ArrayList<>();
		l2.add("Hello");
		l2.add("Test");
		l2.add("Hello");
		l2.add("Test");	
		//Remove first object found.
		l2.remove(new String("Test"));
		System.out.println(l2);	
	}
}
