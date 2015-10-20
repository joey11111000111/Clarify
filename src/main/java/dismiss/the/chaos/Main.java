/**
 * Disiss the chaos package stuff
 */
package dismiss.the.chaos;
import java.util.List;

/**
 * This is a test class, just to see whether things work or not
 */

class Main {

	/**
	 * This method is the entry point. It does some printing to the std output
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Application starting...");
		System.out.println("Calculating random number");
		int rnd = (int)(Math.random() * 123);
		System.out.println("The random number is: " + rnd);
		System.out.println("Calling the line separator method");
		insertSeparatorLine();
	}//main

	/**
	 * This method is only for printing a separator line, made of '-' -marks
	 */
	static void insertSeparatorLine() {
		System.out.println("---------------------------------");
	}
	
}//class
