package java8.streamdemo;

import java.util.stream.IntStream;

public class IntStreamDemo3 {

    private static void intStreamDemo() {
        String[] myArray = new String[] { "stream", "is", "a","sequence", "of", "elements",
                "like", "list" };

        // createing instream on range of integers
        // filter by even integer and map
        // the integer to the Object of myArray
        IntStream.rangeClosed(0, myArray.length - 1)
                .filter(x -> x % 2 == 0)
                .mapToObj(x -> myArray[x])
                .forEach(System.out::println);
        // Output is :
        // stream
        // a
        // of
        // like
    }

    public static void main(String[] args) {
        intStreamDemo();
    }

}
