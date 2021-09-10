package com.per.streamtest;

import java.util.List;
import java.util.stream.Stream;

public class Mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inList = List.of(1,2,3,4);
		
		//Can only be consumed once but can contain endless number of elements.
		Stream<Integer> ints = inList.stream();
		ints.map(i-> i+1).filter(i->i<4).forEach(System.out::println);
	}
}
