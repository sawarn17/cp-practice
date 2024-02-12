package javautildemo.javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamDemo {
	/*
	 * 
	 * It Extends base Stream class 
	 * 
	 * 
	 * elements supporting sequential and parallel aggregate operations.
	 * 
	 * 
	 */
	
	public static void main(String [] args) {
		List<Long> listOfarray = Arrays.asList(1L,2L,3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
		 Stream<String> streamofString = Stream.of("ayam", "shifo", "Test", "Get", "Root", "Site"); 
		/*
		 * For Each
		 * It is a consumer || Terminal Opration || Perform to traverse or some side Effects.
		 * 
		 *  The behavior of this operation is explicitly nondeterministic. Also, 
		 *  for any given element, the action may be performed at whatever time and in whatever thread
		 *   the library chooses.
		 *   
		 */
		listOfarray.stream().forEach(System.out::print);//12345678910
		listOfarray.stream().sorted(Comparator.comparing(Long::longValue)).forEach(System.out::print);//12345678910
		listOfarray.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		streamofString.forEach(System.out::println);
		
	}
}
