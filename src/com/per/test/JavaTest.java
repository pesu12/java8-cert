package com.per.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BaseClass{

static int x = 5;

	public int getValue(){
		return x;
	}
}

class SubClass extends BaseClass{

	static int x = 4;

	public int getValue(){
		return x;
	}	

}

public class JavaTest extends SubClass{

	static final public void main(String[] args){
		
		String[] array = {"Test"}; 
		
		List<String> a = Arrays.asList(array);
		//a.add("Hello");
		
		System.out.print(a);
		
		ArrayList<String> b = new ArrayList<>();
		b.add("Per");
		b.clear();
		
		b.add("Per");		
		b.contains("Per");
		
		b.forEach(n -> print(n));
		System.out.println(b.toString());
		
	}
	
	public static void print(String n)
    {
        System.out.println("Student Name is " + n);
    }
}