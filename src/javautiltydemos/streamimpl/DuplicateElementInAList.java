package javautiltydemos.streamimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//finding of duplicate element in the list using java 8
public class DuplicateElementInAList {
    
    //method 1.
    public static void showAllDuplicateElements(List<Integer> list){
        Map<Integer, Long> collectedValue = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("THE MAPPED ELEMENT ARE :::::"+ collectedValue);

        //displaying the details
        collectedValue.entrySet().stream().filter(data -> data.getValue() > 1)
        .map(Map.Entry::getKey).collect(Collectors.toSet()).forEach(System.out::println);
    }


    //by collections frequency
    public static void dupsByCollectionsFrequency(List<Integer> listDetails){
        System.out.println("::::::::::::::::::::::::THIS IS DEMO OF COLLEction FREQ::::::::::::::::::::::::::::::::::");
        listDetails.stream()
        .filter(data -> Collections.frequency(listDetails, data) > 1).collect(Collectors.toSet()).forEach(System.out::println);
    }

    //via genric stream
    public static Set<Integer> findDuplicateInStream(List<Integer> allList){
        System.out.println("::::::::::::::::::::::::::::::::This is demo of Stream and hashSet:::::::::::::::::::::::::::::");
        HashSet<Integer> hashSet = new HashSet<Integer>();
        return allList.stream().filter(data -> !hashSet.add(data)).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,5,6,7,7,8,8,8,9);
        showAllDuplicateElements(intList);
        dupsByCollectionsFrequency(intList);
        System.out.println(findDuplicateInStream(intList));
    }
}
