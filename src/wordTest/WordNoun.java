package wordTest;

public class WordNoun extends WordBase{

	public WordNoun(StringBuilder word) {
		super();
		this.word = word;
	}
	
	StringBuilder word;

	public StringBuilder getWord() {
		return word;
	}

	public void setWord(StringBuilder word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "[word=" + word + "]";
	}
}
