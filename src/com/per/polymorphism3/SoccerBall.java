package com.per.polymorphism3;

abstract class Ball {
	protected final int size=5;
	//public Ball(int size) {
	//	this.size = size;
	//}
}

interface Equipment{}

public class SoccerBall extends Ball implements Equipment {
	
	protected final static int size=4;
	
	//public SoccerBall() {
		//super(5);
	//}
	
	public Ball get() {return this;}
	
	public static void main(String[] passes) {
		//Here equipment refers to Soccerballs object.'
		//Equipment equipment= (Equipment)(Ball)new SoccerBall().get();
		Equipment equipment= (Equipment)new SoccerBall().get();
		
		
		//Here we use variable equipment and cast it to SoccerBall.
		System.out.println(((SoccerBall)equipment).size);
		System.out.println(((Ball)equipment).size);
		System.out.println(size);
	}

}
