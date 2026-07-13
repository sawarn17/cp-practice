package leetcode.arraydemo.easy;

public class MaximumSubArray_LQN_53 {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static int maxSubArrayV2(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }
}
