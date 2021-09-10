package com.per.excpetiontest;

public class ExceptionTest2 {

	public static void think() throws Exception {
		try {
			throw new Exception();
		}
		
		//Finally or catch must always be here, even if throws Exception is done.
		finally {
			
		}
	}
	
	public static void main(String[] args) throws Exception{
		think();
	}

}
