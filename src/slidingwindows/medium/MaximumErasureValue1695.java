package slidingwindows.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue1695 {

    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int i=0, j=0, len = nums.length;
        int sum=0, res=0;

        while(j<len){
            if(!map.contains(nums[j])){
                map.add(nums[j]);
                sum += nums[j];
                res = Math.max(sum, res);
                j++;
            }else{
                sum -= nums[i];
                map.remove(nums[i]);
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(arr));
    }
    
}
