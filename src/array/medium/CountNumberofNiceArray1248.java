package array.medium;

import java.util.HashMap;
import java.util.Map;

//1248. Count Number of Nice Subarrays
public class CountNumberofNiceArray1248 {

    public static int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;

        map.put(currSum, 1);

        for (int i = 0; i < nums.length; i++) {
            currSum += (nums[i] % 2);

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static int numberOfSubarraysV2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;

        map.put(0, 1); // Initialize the map with 0 sum having one occurrence.

        for (int num : nums) {
            currSum += num % 2; // Increment currSum by 1 if the number is odd, otherwise by 0.

            // If the (currSum - k) is present in the map, it means there are
            // 'map.get(currSum - k)'
            // subarrays that end at the current position with exactly k odd numbers.
            count += map.getOrDefault(currSum - k, 0);

            // Increment the count of currSum in the map.
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 1 };
        int k = 3;

        int res = numberOfSubarraysV2(arr, k);
        System.out.println("THE RESULT ARE " + res);

    }

}
