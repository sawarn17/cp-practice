package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationInMap2 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        //Method 1: KeySet
        for(Integer key : map.keySet()){
            System.out.println("MAP KEY IS :-"+ key + " And Value is "+ map.get(key));
        }

        //Method 2: EntrySet
        for(Map.Entry<Integer,Integer> temp : map.entrySet()){
            System.out.println("THE KEY IS :=="+temp.getKey() +" THE VALUE IS=="+ temp.getValue());
        }

        //Method 3: Lambda forEach
        map.forEach((key, val)->{
            System.out.println("THE KEY IS ==="+ key +" THE VALUE IS =="+val);
        });

        //Method 4: Iterator (Moved inside the main method)
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Method 5: Stream EntrySet
        map.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

    }
}
