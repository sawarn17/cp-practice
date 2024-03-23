package javautiltydemos.collectonsimpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassImpl {

    //collection frequency
    public static void getCollectionFrequency(List<Integer> arrList){
        //this is a sample of collection frequency how many time an elements is present.
        //it works on override of equals method of objects to objects
        arrList.stream()
            .distinct() // This will ensure each element is processed only once
            .forEach(data -> System.out.println(data + ": " + Collections.frequency(arrList, data)));
    }

    //collections reverse order
    //it is works only in Objects type does't work with primitive type
    //if work with primitive type then it genrates the error
    //no suitblae method for that
    public static void reverseOrder(List<Integer> arrList){
        System.out.println(":::::::::::::::::Demo of collection reverse order:::::::::::::::");
        System.out.println("BEFORE SORTING"+ arrList);
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("REVERSE LIST"+arrList);
    }

    //it will rotate two elements shift left to right
    public static void rotateColletions(List<Integer> rotate){
        System.out.println("Before Rotateing"+ rotate);
       // Before Rotateing[17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        Collections.rotate(rotate, 2); 
        //After rotateing[2, 1, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3]
        System.out.println("After rotateing"+ rotate);
    }

    //two collections are said to be disjoint when no elements are common it.
    //if any collections contains null then it will throw nullpointer exception
    public static void cheakDisjoint(List<Integer> arr1, List<Integer> arr2){
        
    }




    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
        getCollectionFrequency(arrList);
        reverseOrder(arrList);
        rotateColletions(arrList);
    }
}
