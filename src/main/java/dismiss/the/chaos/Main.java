import java.util.List;

class Main {
	
	public static void main(String[] args) {
		System.out.println("Application starting...");
		System.out.println("Calculating random number");
		int rnd = (int)(Math.random() * 123);
		System.out.println("The random number is: " + rnd);
		System.out.println("Calling the line separator method");
		insertSeparatorLine();
	}//main
	
	static void insertSeparatorLine() {
		System.out.println("---------------------------------");
	}
	
}//class
