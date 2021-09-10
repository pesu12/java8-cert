package com.per.interfacetest.logabletest;

public class SystemStatus implements Logable{

	private long createdTimestamp;
	
	public SystemStatus() {
		createdTimestamp=System.currentTimeMillis();
	}
	
	private int getStatus() {
		if(System.currentTimeMillis()- createdTimestamp> 1000) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String getInitInfo() {
		// TODO Auto-generated method stub
		return "SystemStatus object created " + createdTimestamp;
	}

	@Override
	public String getLogableEvent() {
		// TODO Auto-generated method stub
		return String.valueOf("Status: "+getStatus());
	}

}
