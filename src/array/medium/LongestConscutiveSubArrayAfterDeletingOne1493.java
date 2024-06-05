package array.medium;

public class LongestConscutiveSubArrayAfterDeletingOne1493 {

    public static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            zeroCount += (nums[j] == 0 ? 1 : 0);

            while (zeroCount > 1) {
                zeroCount -= (nums[i] == 0 ? 1 :0);
                i++;
            }

            longestWindow = Math.max(longestWindow, j - i);
        }

        return longestWindow;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println("THIS IS THE LONGEST SUBARRAY ARE " + longestSubarray(nums));
    }
}
