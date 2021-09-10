package wordTest;

import java.util.ArrayList;

import com.per.polymorphismtest2.Animal;

public class Inventory {

	ArrayList<WordBase> words= new ArrayList<WordBase>();
	ArrayList<String> types = new ArrayList<String>();
	
	public void addWord(WordBase word) {
		word.addWord();
		
		words.add(word);
		//System.out.println(word.getClass().getSimpleName());
	}
	
	public void displayInventory() {
		/*
		for(String type: types){
			System.out.println(type);
		}
		*/
		
		for(WordBase word: words){
			System.out.println(word);
		}
	}
}
