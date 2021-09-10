package com.per.excpetiontest;

public class Coat {
	
	public Long zipper() throws Exception {
		try {
			String checkZipper = (String)new Object();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Broken");
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Coat().zipper();
			System.out.println("Finished");
		} catch (Throwable t) {}
	}

}
