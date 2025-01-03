package leetcode.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestImpl {

    public static boolean isContainsDistinct(int [] arr){
        HashSet<Integer> response = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if(response.contains(Integer.valueOf(arr[i]))){
                return true;
            }
            else{
                response.add(Integer.valueOf(arr[i]));
            }
        }
        return false;
    }

    

    public static void main(String[] args) {
        int arr [] = {1,2,3,1};
       // System.out.println(isContainsDistinct(arr));


        // Arrays.asList(arr).stream().collect
        // (Collectors.groupingBy(Function.identity(), Integer::intValue));
        String strs []  = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> groupedAnagrams = Arrays.asList(strs).stream().collect(Collectors.groupingBy(str -> {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }));

        System.out.println(groupedAnagrams);

    }
    
}
