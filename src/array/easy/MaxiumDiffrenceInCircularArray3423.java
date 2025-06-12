package array.easy;

public class MaxiumDiffrenceInCircularArray3423 {

    public static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int diff = Math.abs(nums[0] - nums[n - 1]);

        for (int i = 0; i < n - 1; i++) {
            diff = Math.max(diff, Math.abs(nums[i] - nums[i + 1]));
        }

        return diff;
    }

    public static int maxAdjacentDistanceV2(int[] nums) {
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int nextIndex = (i + 1) % n; // circular Array calculation
            int diff = Math.abs(nums[i] - nums[nextIndex]);
            max = Math.max(max, diff);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -5, -10, -5 };
        System.out.println(maxAdjacentDistanceV2(nums));
    }

}
