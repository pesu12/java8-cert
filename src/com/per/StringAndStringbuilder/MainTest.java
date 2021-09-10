package com.per.StringAndStringbuilder;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = 'c'; Not allowed.
		
		String s = "HelloWorld";
		s = s.substring(5);  //Substring with start from 5
		
		System.out.println(s);
		s = s.substring(1,3);  //Substring with start 1 to 2		
		System.out.println(s);		
		
		s = "HelloWorld";
		StringBuilder x = new StringBuilder("e");
		s=s.replace(x,"l");
		System.out.println(s);	
		
		System.out.println(s.charAt(s.length()-1));
		
		System.out.println(s.indexOf("W"));
		
		s=s.concat("!");
		System.out.println(s);

		
		/////////////////////////////////////////////
		//Stringbuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());	
		sb.append("!");
		System.out.println(sb);	
		sb.delete(1, 2);
		System.out.println(sb);		
		sb.insert(1, "Test");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);		
		System.out.println(sb.reverse());
		
		sb.replace(1,2,"XXXX");
		System.out.println(sb);		
		
		String STR = "ABC";
		
		//Displays true
		String s1 = new String(STR);
        String s2 = new String(STR);
        System.out.println(s1.equals(s2));
 
        //Displays false
        StringBuilder sb1 = new StringBuilder(STR);
        StringBuilder sb2 = new StringBuilder(STR);
        System.out.println(sb1.equals(sb2));
	}

}
