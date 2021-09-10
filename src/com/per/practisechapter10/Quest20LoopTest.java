package com.per.practisechapter10;

public class Quest20LoopTest {

	public static void main(String[] args) {
		int result = 8;
		loop: while (result>7) {
			result++;
			do {
				result--;
			}while(result>5);
			break loop;
		}
		System.out.println(result);
	}
}
