package com.per.interfacetest.smartphone;

public class SmartPhone extends Phone{

	public void sendMail(String message, String address) {
		System.out.println("Smartphone sending email");
	}
	
	public String retrieveMail() {
		System.out.println("Smartphone retrieving Email");
		String message = new String();
		System.out.println("");
		return message;
	}
	
	public boolean isRinging() {
		System.out.println("Smartphone: Checking if phone is ringing");
		boolean ringing = false;
		return ringing;
	}
}
