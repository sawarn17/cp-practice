package striverdsa.arraydemo.easy;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsToK_LQN_560 {
    
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    //prefix sum example
    public static void main(String[] args) {
        int [] nums = {1,1,-1,2,-1,1,3}; 
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
