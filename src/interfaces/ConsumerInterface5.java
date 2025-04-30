package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface5 {
    
    private static Consumer<Integer> display = a -> System.out.println(a);

    private static Consumer<List<Integer>> listDisplay = list -> list.stream().forEach(System.out::println);

    public static void main(String[] args) {
        
        //applying consumer interface to it
        display.accept(20);//op : 20

        //displaying list
        listDisplay.accept(Arrays.asList(1,2,3,4,5)); 
    }
}
