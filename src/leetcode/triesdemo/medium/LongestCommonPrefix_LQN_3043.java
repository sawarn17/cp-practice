package leetcode.array.tries.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix_LQN_3043 {

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int res=0;
        Set<Integer> hashSet= new HashSet<>();
        for(int i : arr1){
            hashSet.add(i);
        }
        
        
        return res;
    }
    
    //tries means prefix tree
    //integer no of digit = (log10 num+1)
    public static void main(String[] args) {
        int [] arr1 = {1,10,100}, arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1, arr2)); 
    }
}
