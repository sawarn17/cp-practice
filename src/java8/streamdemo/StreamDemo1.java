package java8.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

    /*
     * ===========================JAVA STREAM 8 ============================
     * It a new abstract layer of the java comes in java.util.stream package
     * A Stream is a sequence of components that can be processed sequentially.
     * These packages include classes, interfaces, and enum to allow
     * functional-style operations on the elements.
     * 
     * 
     * ----------------Components of Stream----------------------------------
     * 1. Secquence of Elements
     * 2. Source
     * 3. Aggregate Operations
     * 4. Pipelining
     * 5. Internal Operations
     * 
     * Features :
     * It is a not a DS it takes data from Collections, Arrays and IO chnannels
     * It does't chnages the origina DS just providing result based on pipelines
     * Each internal operations work lazily executed and result is the output.
     * When terminal operations are completed as a result was output.
     * 
     * 
     * 
     * -----------------------Operations in Stream---------------------------
     * 1. Intermediate Ops: Intermediate operations transform a stream into another
     * stream
     * Hence we can again apply streams on it. It is lazly loaded internally.
     * ex: filter(), map(), sorted()
     * 
     * 2. Terminal Ops: It returns final result as an absolute value.
     * Ex: collect(), forEach(), reduced()
     * 
     * 3. Short Circuit Operations:
     * Short-circuit operations provide performance benefits by avoiding unnecessary
     * computations when the desired result can be obtained early.
     * They are particularly useful when working with large or infinite streams.
     * Ex: anyMatch(), findFirst(), findAny()
     * 
     */


    private static Stream<Integer> streamOfDemo(){
        return Stream.of(1,2,3,4,5,6,7,8, 9, 10);
    }

    private static void sortingDemo(){
        //perform sorting on reverse order
        // distinct is used to removed the duplicates from the stream
        List<Integer> reversedInt = streamOfDemo().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println("THE REVERSESED DATA IS " + reversedInt);
    }

    private static void demoOfFindAny(){
        // find any returns the Optional<T> value

        Optional<Integer> findAnyValue = streamOfDemo().filter(data -> data % 2 == 0).findAny();

        System.out.println(findAnyValue);
    }

    private static void demoOfAnyMatch(){
        // it return true value accept predicate on the baisis of predicate return boolean value

        boolean isMatched = streamOfDemo().anyMatch(data -> data %3 == 0);
        System.out.println(isMatched);
    }

    
    //use for just like looping and using some lambda operation on it return type is void
    // just a diff :: here we can use lambda operators
    private static void demoOfForEachMethod(List<Integer> details){
        details.stream().forEach(System.out::println);
        details.stream().forEach(System.out::println);
    } 

    private static List<Integer> getAllEvenNumberUseingFilter(List<Integer> details) {
        return details.stream().filter(data -> data % 2 == 0).collect(Collectors.toList());
    }

    private static void filterDataOfEvenIndex(){
        List<String> testData = Arrays.asList("EVEN", "ODD", "EVEN", "ODDD", "Even", "ODDD");

        // create an AtomicInteger 
        // When we want to process the data in the predicates then predicates can expect final variable
        // so that we need to create a atomicInteger which treated like a final varibale
        AtomicInteger atomicInteger = new AtomicInteger(0); 

        // here getIncrement increses value by one
        testData.stream().filter(data -> atomicInteger.getAndIncrement() %2 ==0).forEach(System.out::println);
    }

    private static List<Integer> getALlEvenNumberUsingReduedMethod(List<Integer> details) {
        //Here i am creating the new arraylist as a first args and now for seconds args
        // we are performingg two lambda operations
        return details.stream().reduce(new ArrayList<Integer>(),
                (a, b) -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                },
                (a, b) -> {
                    a.addAll(b);
                    return a;
                });
    }

    public static void main(String[] args) {
        List<Integer> testData = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("THE EVEN NUMBER ARE " + getAllEvenNumberUseingFilter(testData));
        System.out.println("THE EVEN NUMBER USING REDUCED METHOD"+getALlEvenNumberUsingReduedMethod(testData));
        System.out.println("\n\tTHE EVEN INDEX STRINGS ARE \n");
        filterDataOfEvenIndex();

        demoOfForEachMethod(testData);
        sortingDemo();
        demoOfFindAny();
        demoOfAnyMatch();
    }
}
