package com.per.practisechapter10;

import java.util.Arrays;
import java.util.List;

public class Quest45Exams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> exams = Arrays.asList("OCA","OCP");
		for(String e1: exams)
			for(String e2: exams)
				System.out.print(e1+ " " +e2);
		System.out.println();
	}

}
