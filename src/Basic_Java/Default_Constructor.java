package Basic_Java;

public class Default_Constructor {

	int x;
	
	public Default_Constructor(){
		x = 5;
	}
	
	public static void main(String[] args) {
		Default_Constructor obj = new Default_Constructor();
		System.out.println("Value of x is: " +obj.x);
	}
}
