package javautiltydemos.streamimpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//this is used to make sliceing in the java stream
public class SliceElements {

    //it will skip the five elements from the left side
    //just skip the total number of elements that is provided within skip
    public static void makeSliceingOfElements(List<Integer> allList){
        allList.stream().skip(5).forEach(System.out::println);
    }
    

    public static void makeSliceInList(List<Integer> intlist, int start, int end){
        intlist.stream().skip(start).limit(end - start+1).forEach(System.out::println);
    }

    //just make slice between the number we have passed 
    //it also throw the INdex out of bound 
    public static void makeingSublist(List<Integer> intList, int start, int end){
        System.out.println("THIS IS MAKEING SLICE USING SUBLIST");
        intList.stream().collect(Collectors.toList()).subList(start, end).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        makeSliceingOfElements(intList);
        System.out.println("::::::::::::::::::::THIS IS SLICING OF ELEMENTS BETWEEN 3 TO 9::::::::::::::::::::::::");
        makeSliceInList(intList, 3, 9);
        makeingSublist(intList, 3, 6);
    }
}
