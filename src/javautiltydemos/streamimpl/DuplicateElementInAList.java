package javautiltydemos.streamimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//finding of duplicate element in the list using java 8
public class DuplicateElementInAList {
    
    public static void showAllDuplicateElements(List<Integer> list){
        Map<Integer, Long> collectedValue = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("THE MAPPED ELEMENT ARE :::::"+ collectedValue);

        //displaying the details
        collectedValue.entrySet().stream().filter(data -> data.getValue() > 1).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,5,6,7,7,8,8,8,9);
        showAllDuplicateElements(intList);
    }
}
