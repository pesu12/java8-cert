package com.per.practisechapter10;

interface Friend {
	public String getName();
}


class Cat implements Friend {
	public String getName() {
		return "Kitty";
	}
}
public class Quest54Dog implements Friend{

	public String getName() throws RuntimeException {
		return "Doggy";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend =new Quest54Dog();
		System.out.println(((Cat)friend.getName());
		System.out.println(((Quest54Dog)null).getName());
		
	}

}
