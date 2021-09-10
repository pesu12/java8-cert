package com.per.aftercert;

public class gctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  fruit1 = new String("apple");
		String  fruit2= new String("orange");		
		String  fruit3= new String("pear");
		
		System.out.println(fruit1.hashCode());
		System.out.println(fruit2.hashCode());
		System.out.println(fruit3.hashCode());
		
		System.out.println("");
		
		fruit3 = fruit1;
		fruit2 = fruit3;
		fruit1 = fruit2;
		System.out.println(fruit1.hashCode());
		System.out.println(fruit2.hashCode());
		System.out.println(fruit3.hashCode());
		
		//Two objects are eligable for garbage collection since they point to fruit3;
		
		System.out.println("");
		
		String shoe1= new String("Sandal");
		String shoe2= new String("flip flop");		
		String shoe3= new String("croc");
		
		System.out.println(shoe1.hashCode());
		System.out.println(shoe2.hashCode());
		System.out.println(shoe3.hashCode());
		System.out.println("");
		
		System.out.println("");
		
		shoe1= shoe2;
		shoe2= shoe3;
		shoe3=shoe1;
		
		System.out.println(shoe1.hashCode());
		System.out.println(shoe2.hashCode());
		System.out.println(shoe3.hashCode());
	}

}
