
public class StaticMethodTest {

	static int s1;
	int s2;
	final static int CONST=5;
	
	public static void getTest() {
		s1=10;
		//s2=5; not possible in a static method
	}
	
	public static void main(String[] args) {

	}

}
