package slidingwindows.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestHarmoniousSubsequence594 {

    public static boolean isHomeGenousAsPerCondition(int max , int value){
        return Math.abs(max - value) == 1;
    }

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen =0;

        for(int i=0; i<nums.length; i++){
            map.compute(nums[i], (key, val) -> val == null ? 1 : val + 1);
        }

        for(int i : map.keySet()){
            if(map.containsKey(i+1)){
                maxLen = Math.max(maxLen, map.get(i)+map.get(i+1));
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));

        //op : [3,2,2,2,3]
    }  
}
