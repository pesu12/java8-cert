package com.per.excpetiontest;

import java.io.FileNotFoundException;
import java.io.IOException;

class School {
	public int getNumberOfStudentsPerClassroom(String... students) throws IOException {
		return 3;
	}
	
	public int getNumberOfStudentsPerClassroom() throws IOException {
		return 9;
	}
}

public class ExceptionTest3 extends School {
	
	public int getNumberOfStudentsPerClassroom() throws FileNotFoundException {
		return 2;
	}
	
	public static void main(String[] args) throws IOException {
		School school = new ExceptionTest3();
		// TODO Auto-generated method stub
		System.out.println(school.getNumberOfStudentsPerClassroom());
	}

}
