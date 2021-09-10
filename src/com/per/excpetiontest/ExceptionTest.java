package com.per.excpetiontest;

public class ExceptionTest {

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		think();
	}

	private static void think() throws Exception{
		try{
			throw new Exception();
		}
		finally{
		}
		
	}

}
