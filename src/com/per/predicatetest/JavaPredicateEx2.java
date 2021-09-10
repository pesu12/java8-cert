package com.per.predicatetest;

import java.util.List;
import java.util.function.Predicate;

public class JavaPredicateEx2 {
	public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        Predicate<Integer> btf = n -> n > 5;

        nums.stream().filter(btf).forEach(System.out::println);
    }
}
