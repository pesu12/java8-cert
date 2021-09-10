package com.per.interfacetest.smartphone;

public class Tester {

	public static void main(String[] args) {
		new Tester();
	}
	
	public Tester() {
		Phone landLinePhone= new Phone();
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("About to test a land line phone as a phone");
		testPhone(landLinePhone);
		System.out.println("\nAbout to test a smartphone as a phone");
		testPhone(smartPhone);
		System.out.println("\nAbout to test a smartphone as a smartphone");
		testSmartPhone(smartPhone);
		
	}
	
	//Här är polymorfísm. Man kan skicka in smartphone ...
	private void testPhone(Phone phone) {
		phone.callNumber(888888L);
		phone.isRinging();
	}
	
	private void testSmartPhone(SmartPhone phone) {
		phone.sendMail("Hi", "pesu@hotmail.com");
		phone.retrieveMail();
	}
}
