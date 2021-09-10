package com.per.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbstractWordFromSentence {
	
	static int hit;

	public static void main(String[] args){
		
		String sentence = "This is a test test";
		String[] sentencearray = sentence.split(" ");
		
		List x = new ArrayList();
		
		List<String> sentenceList = Arrays.asList(sentencearray);
		
		System.out.println(sentenceList);
		
		if(sentenceList.contains("test"))
			for(String i: sentenceList)
				if(i.equals("test")) {
					hit++;
				}
		System.out.println(hit + " , " + "test");
	}
}
