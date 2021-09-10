package examquest4;

public class Crossword {

	public Crossword() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] crossword[] = new int[10][20];
		for (int i=0;i< crossword.length;i++){
			System.out.print("\n");
			for (int j=0;j< crossword.length;j++){
				crossword[i][j]='x';
				System.out.print(crossword[i][j]+ " ");
			}
		}
		System.out.println("\n" +crossword.length);
		System.out.println(crossword[0].length);		
	}

}
