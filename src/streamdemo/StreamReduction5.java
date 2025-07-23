package streamdemo;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduction5 {


   
    /*
     * There are 3 Parts used in reduction
     * 1.identity : It is initial value of accumulator
     *            : or a default value if a stream is empty and there is nothing to accumulate
     * 
     * 2.Accumulator : a function which specifies the logic of the aggregation of elements. 
     *            : As the accumulator creates a new value for every step of reducing, 
     *            : the quantity of new values equals the stream’s size and only the last value is useful.
     *            : This is not very good for the performance.
     * 
     * Combiner:
     *       a function which aggregates the results of the accumulator. 
     *      We only call combiner in a parallel mode to reduce the results of accumulators from different threads. 
     */

    public static void sumOfFirstFiveumbers(){
        OptionalInt sum = IntStream.rangeClosed(1, 5).reduce((a, b) -> a+b);
        // do same for substraction and multiplication
        System.out.println(sum.getAsInt());
    }

    public static void sumOfFirstFiveumbersWithPassedArgs(){
        int sum = IntStream.rangeClosed(1, 5).reduce(10, (a, b) -> a+b);
        // do same for substraction and multiplication (here sum is 10 + all reductions)
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfFirstFiveumbers();
        sumOfFirstFiveumbersWithPassedArgs();
    }
}
