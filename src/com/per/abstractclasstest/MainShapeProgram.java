package com.per.abstractclasstest;

public class MainShapeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable d1 = new Cat();
		Drawable d2 = new Circle();
		d1.draw();
		d2.draw();
		
		((Circle) d2).area();
		
		Circle c = new Circle();
		c.r=10.0;
		
		Rectangle r = new Rectangle();
		r.h=5.0;
		r.w=7.0;
		
		double diff = AnotherClass.areaDifference(c,r);
		System.out.println(diff);
	}
	
	public static void print(Drawable d) {
		d.draw();
	}

}
