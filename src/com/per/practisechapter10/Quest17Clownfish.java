package com.per.practisechapter10;

class BubbleException extends Exception{}
class Fish {
	
	Fish getFish() throws BubbleException{
		throw new RuntimeException("fish");
	}
}

public final class Quest17Clownfish extends Fish{

	public final Quest17Clownfish getfish() {
		throw new RuntimeException("clown");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Fish f = new Quest17Clownfish();
		try {
			f.getFish();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("Catch handled");
		} 
		
		catch (BubbleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Swim");
	}
}
