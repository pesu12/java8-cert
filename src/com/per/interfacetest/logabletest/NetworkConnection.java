package com.per.interfacetest.logabletest;

public class NetworkConnection implements Logable{

	private long createdTimeStamp;
	private String currentLogMessage;
	
	public NetworkConnection() {
		createdTimeStamp = System.currentTimeMillis();
		currentLogMessage = "Initialized";
	}
	
	public void connect() {
		currentLogMessage ="Connected at " + System.currentTimeMillis();
	}
	
	@Override
	public String getInitInfo() {
		// TODO Auto-generated method stub
		return "NetworkConnection object created " + createdTimeStamp;
	}

	@Override
	public String getLogableEvent() {
		// TODO Auto-generated method stub
		return currentLogMessage;
	}

	
}
