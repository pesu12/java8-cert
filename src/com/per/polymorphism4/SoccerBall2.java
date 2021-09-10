package com.per.polymorphism4;


abstract class Ball2 {
	protected final int size;
	public Ball2(int size) {
		this.size = size;
	}
}

interface Equipment2{}

public class SoccerBall2 extends Ball2 implements Equipment2 {
	public SoccerBall2() {
		super(5);
	}
	
	public Ball2 get() {return this;}
	
	public static void main(String[] passes) {
		// TODO Auto-generated method stub
		Equipment2 equipment2= (Equipment2)(Ball2)new SoccerBall2().get();
		System.out.println(((SoccerBall2)equipment2).size);

	}

}

