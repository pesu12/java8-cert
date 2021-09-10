package com.per.practisechapter10;

import java.util.ArrayList;
import java.util.List;

public class Quest15ListDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList(); //Compile with warning
		//List<> b = new ArrayList(); //<> on left side can not be empty
		List<String> c = new ArrayList<>(); //Compiles without warning
		//List<>d = new ArrayList<>();//<> on left side can not be empty
		List<String> e = new ArrayList<String>(); //Compiles without warning
		List<> f = new ArrayList<String>();//<> on left side can not be empty
	}
}
