package com.per.aftercert;

public class EnhancedForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str = {{"A","B","C"},{"D","E"}};
		for(String[] s: str) {
			for(String s2:s) {
				System.out.println(s2);
			}
		}
		
		System.out.println("\n");
		
		for(int i = 0;i<str.length;i++) {
			String[] s = str[i];
			for(int j=0;j<s.length;j++) {
				String s2 = s[j];
				System.out.println(s2);
			}
		}
	}

}
