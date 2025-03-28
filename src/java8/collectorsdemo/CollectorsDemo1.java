package java8.collectorsdemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo1 {

    // This is a terminal operation of stream
    public static void demoOfCollectType() {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        // this is used to trasform any collection to the other collections
        // A Stream instance representing a sequence of elements, and then collect them
        // into a LinkedList instance:
        List<String> linkedList = givenList.stream().collect(Collectors.toCollection(LinkedList::new));

        // converting it into list and set
        List<String> listDetails = givenList.stream().collect(Collectors.toList());
        List<String> unmodifedList = givenList.stream().collect(Collectors.toUnmodifiableList());
        Set<String> setDetails = givenList.stream().collect(Collectors.toSet());
        Set<String> unmodifedSet = givenList.stream().collect(Collectors.toUnmodifiableSet());

        //Dealing with Map:
        //*need to provide two functions: keyMapper() and valueMapper()
        //Firstly, we’ll use keyMapper() to extract a Map key from a Stream element.
        // Then, we can use valueMapper() to extract a value associated with a given key.
        /*
         * ****Note that toMap() doesn’t even evaluate whether the values are also equal. If it sees duplicate keys, 
         * it immediately throws an IllegalStateException.
         * 
         * 
         */

        Map<String, Integer> identityMap = givenList.stream().collect(Collectors.toMap(Function.identity(), String::length));
        // Working : Function.identity() is just a shortcut for defining a function that accepts and returns the same value.

        //Binary Operators
        /*
         * The third argument here is a BinaryOperator(), where we can specify how we want to handle collisions. 
         * In this case, we’ll just pick any of these two colliding values because we know that the same strings will always have the same lengths too.
         */
        Map<String, Integer> mappHandleDupsKeys = givenList.stream().collect(Collectors.toMap(Function.identity(), String::length, (item, identicalItem) -> item));

        //Java 10
        Map<String, Integer> unmodifiedableMap = givenList.stream().collect(Collectors.toUnmodifiableMap(Function.identity(), String::length)); 
    }

    
    public static void summingOfStringLength(){
       int sumOfFirstFiveNumber = Stream.of(1,2,3,4,5).collect(Collectors.summingInt(Integer::valueOf));
       System.out.println(sumOfFirstFiveNumber);
    }


    //The Joining() collector can be used for joining Stream<String> elements.
    public static void colletorsJoining(List<String> listOfDetails){
        String collect = listOfDetails.stream().collect(Collectors.joining("--"));
        System.out.println("THE JOINING "+ collect);
        //OutPut is: THE JOINING a--bb--ccc--dd

        String prePostDealing = listOfDetails.stream().collect(Collectors.joining(" ", "PRE_PART (", ") POST_PART"));
        System.out.println(prePostDealing);
        //OutPut is : PRE_PART (a bb ccc dd) POST_PART
    }



    /*
     * Here we are dealing with colletors :
     * It is a final Step of Stream processing system.
     * 
     * ** The strategy for this collect operation is provided via the Collector
     * interface implementation.
     * 
     */
    public static void main(String[] args) {

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        colletorsJoining(givenList);

        System.out.println("------------------------------------------------------------");
        summingOfStringLength();

    }
}
