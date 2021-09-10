package wordTest;

public abstract class WordBase {

	static int numberOfWords =0;
	
	public void addWord() {
		numberOfWords++;
	}

	public static int getNumberOfWords() {
		return numberOfWords;
	}
}
