package com.per.listtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List mylist = new ArrayList();
		//mylist.add(1);
		mylist.add("Cat");
		mylist.add(1,"Dog"); 
		mylist.add(2);
		mylist.remove(1);
		System.out.println(mylist.toString());
		System.out.println(mylist.isEmpty());
		System.out.println(mylist.size());
		mylist.clear();
		
		List mylist2 = mylist;
		mylist2.add("Sheep");
		mylist2.add(1);		
		System.out.println(mylist.toString()); //When changing list 2 it affects list as well.
		System.out.println(mylist2.contains("Sheep"));
		System.out.println(mylist2.contains("S"));
		System.out.println(mylist2.contains(new Integer(1)));		
		
		//String to arraylist
		String s = "Accenture";
		List t = Arrays.asList(s);
		t.set(0,"Ericsson");
		//t.add("Polystar"); not supported
		System.out.println(t.get(0));
		System.out.println(s);
		System.out.println(s);	
		
	}

}
