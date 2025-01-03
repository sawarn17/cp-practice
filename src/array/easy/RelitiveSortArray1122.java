package array.easy;

import java.util.Map.Entry;
import java.util.TreeMap;

public class RelitiveSortArray1122 {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int [] res = new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+ 1);
        }

        int index=0;
        for(int i : arr2){
            int count = map.get(i);
            while (count > 0) {
                res[index++] = i;
                count--;
            }
            map.remove(i);
        }

        for(Entry<Integer, Integer> data : map.entrySet()){
            int terms = data.getValue();
            while(terms > 0){
                res[index++] = data.getKey();
                terms--;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};

        int [] res = relativeSortArray(arr1, arr2);
        
        for(int i: res){
            System.out.print(i +" ");
        }
    }
    
}
