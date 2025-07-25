package streamdemo;

import java.util.Arrays;
import java.util.List;

public class StreamTakeAWhileDemo {

    private static void takeAWhileDemo(List<String> takeAWhile){
        takeAWhile.stream().takeWhile(n -> n.length() % 2 != 0).forEach(System.out::println);
    }
 
    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Tst", "sum", "eatts", "ghtta");
        takeAWhileDemo(asList);
    }
}
