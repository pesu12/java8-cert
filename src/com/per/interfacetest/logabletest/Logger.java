package com.per.interfacetest.logabletest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	private BufferedWriter out;
	
	public Logger() throws IOException {
		out = new BufferedWriter(new FileWriter("Logfile.txt"));
	}
	
	public void appendToLog(Logable logable) throws IOException{
		out.write("Object history: " + logable.getInitInfo());
		out.newLine();
		out.write("Obje3ct log event: " + logable.getLogableEvent());
		out.newLine();
	}
	
	public void close() throws IOException {
		out.flush();
		out.close();
	}
}
