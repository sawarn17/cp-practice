package hashmapcumhashset;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class HandsOfStright846 {

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while (!map.isEmpty()) {
            int firstElement = map.firstKey();

            int i = 0;
            while (i < groupSize) {
                int currentElement = firstElement + i;
                if (!map.containsKey(currentElement)) {
                    return false;
                }
                map.put(currentElement, map.get(currentElement) - 1);

                if(map.get(currentElement) ==0){
                    map.remove(currentElement);
                }
                i++;
            }

        }

        return true;
    }

    public boolean isNStraightHandv2(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int start = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int currentElement = start + i;
                    if (map.getOrDefault(currentElement, 0) < count) {
                        return false;
                    }
                    map.put(currentElement,
                     map.get(currentElement) - count);
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        int groupSize = 3;

        System.out.println("THE GROUP SIZE IS " + isNStraightHand(arr, groupSize));
    }

}
