/*
 * Java Always need String as an args because
 * 1.Consistency and Convention: Having a standard method signature for the main method (public static void main(String[] args)) provides consistency across Java applications.
 * 2. Backward Compatibility:
 * 3. String[] args - Command-Line Arguments: pass command line arguments
 * 4. It's important to note that if you don't need to use command-line arguments in your application, you can simply ignore the args parameter in your main method. However, the method signature still needs to include String[] args for the JVM to recognize it as the entry point of the application.
 */

public class Competive {
	
	public static void main(String [] args) {
		System.out.print("Hi this is setup");
	}

}
