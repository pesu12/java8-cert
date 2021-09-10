package com.per.tostring;

class Dog{
	
	String Dog;

	public Dog(String dog) {
		super();
		Dog = dog;
	}

	public String getDog() {
		return Dog;
	}

	public void setDog(String dog) {
		Dog = dog;
	}

	@Override
	public String toString() {
		return "Dog [Dog=" + Dog + "]";
	}
}


public class ToStringTest {

	public static void main(String[] args) {
		
		//Doing toString from a created class.
		Dog d = new Dog("Rufi");
		System.out.println(d.toString());
		
		//Creating an integer of value 10
        Integer number=10;
        // Calling the toString() method as a function of the Integer variable
        System.out.println( number.toString() );
        
        // The method is called on datatype Double
        // It is passed the double value as an argument
        String s = Double.toString(11.0);
        System.out.println(s); 
	}

}
