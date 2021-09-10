package com.per.predicatetest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args){
		List<Integer> numList= Arrays.asList(5,8,9);
		
		System.out.println(numList);
		printFilter(numList, (Integer c) ->  {return c>5;});
	}
	
	public static void printFilter(List<Integer> nums, Predicate<Integer> conditions) {
		
		for(Integer num: nums) {
			if(conditions.test(num)) {
				System.out.println(num);
			}
		}
	
	}
}
