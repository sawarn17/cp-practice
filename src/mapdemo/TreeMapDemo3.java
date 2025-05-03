package mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {

    //here sorting done based on natural order
    private static void treeMapDemo(){
        TreeMap<Integer, Integer> integerNaturalOrder = new TreeMap<>();

        for(int i=1; i<=10; i++){
            integerNaturalOrder.put(i, i);
        }

        System.out.println(integerNaturalOrder);
    }

    private static void treeMapDemoWithReverseOrder(){
        TreeMap<Integer, Integer> integerNaturalOrder = new TreeMap<>(Comparator.reverseOrder());

        System.out.println("==========================================================");
        for(int i=1; i<=10; i++){
            integerNaturalOrder.put(i, i);
        }

        System.out.println(integerNaturalOrder);
    }

    
    /*
     * TreeMap is a map implementation that keeps its entries sorted according to the natural ordering of its **keys 
     * 
     */
    public static void main(String[] args) {
        treeMapDemo();
        treeMapDemoWithReverseOrder();
    }
}
