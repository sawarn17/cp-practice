package extracurriculum.array.slidingwindow.easy;

public class MaximumAverageSubArrayLQN643 {

    public static double findMaxAverageV1(int[] nums, int k) {
        int currentSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Sliding window
        for (int j = k; j < nums.length; j++) {
            currentSum += nums[j]; // add next element
            currentSum -= nums[j - k]; // remove previous window element
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverageV1(nums, k));
    }
}
