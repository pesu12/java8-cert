package com.per.aftercert;

public class LoopContinueBreakTest {

	public static void main(String[] args) {
		
		String[] arr = {"A","B","C"};
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]=="B")
				break;
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]=="B")
				continue;
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		for(int i = 0;i<arr.length;) {
			System.out.println(arr[i]);
			i++;
		}
	}
}
