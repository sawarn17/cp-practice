package twopointerslidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraySum_LQN_30 {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 occurs once initially
        map.put(0, 1);

        int count = 0;
        int currSum = 0;

        for (int num : nums) {
            currSum += num;

            // check if there exists a prefix sum = currSum - goal
            count += map.getOrDefault(currSum - goal, 0);

            // store/update current prefix sum frequency
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0, 0 };
        int goal = 0;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}
