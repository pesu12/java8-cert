package com.per.interfacetest.logabletest;

public class Tester2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new Tester2();
	}
	
	public Tester2() throws Exception {
		Logger logger = new Logger();
		SystemStatus systemStatus = new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		networkConnection.connect();
		Thread.sleep(2000);
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		logger.close();
	}

}
