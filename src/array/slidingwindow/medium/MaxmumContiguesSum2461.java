package array.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

public class MaxmumContiguesSum2461 {

    public static long maximumSubarraySum(int[] nums, int k) {
        int max =0;
        int i=0,j=0, count=0;
        Map<Integer, Integer> map = new HashMap<>();

        while(j<k){
            if(map.containsKey(nums[i])){
                i++;
                count=0;
            }else{
                map.put(nums[j], nums[j]);
                count += nums[j++];
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(arr, arr.length-1));
    }
    
}
