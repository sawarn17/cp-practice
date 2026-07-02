package leetcode.arraydemo.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongesBalancedSubArray1319 {

    private static int longestBalanced(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();
            // mainly focused on here : j =i
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0)
                    even.add(nums[j]);
                else
                    odd.add(nums[j]);
                if (even.size() == odd.size()) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private static int longestBalancedV2(int[] nums) {
        int max = 0, bal = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                bal++;
            else
                bal--;
            if (map.containsKey(bal)) {
                max = Math.max(max, i - map.get(bal));
            } else {
                map.put(bal, i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };
        System.out.println(longestBalancedV2(arr));
    }

}
