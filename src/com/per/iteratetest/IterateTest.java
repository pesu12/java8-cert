package com.per.iteratetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 
		numbers.addAll(Arrays.asList(1,2,3,4,5,6));
		System.out.println(numbers);
		
		//Iterator
		for(Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();){
			Integer number = iterator.next();
			System.out.println(number);
			iterator.remove();
		}
		System.out.println(numbers);
		
		//List Iterator.
		numbers.addAll(Arrays.asList(1,2,3,4,5,6));
		//Iterator starts from 3
		for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();){
			System.out.println(listIterator.previous());
			listIterator.remove();
		}	
		System.out.println(numbers);	
	}
}
