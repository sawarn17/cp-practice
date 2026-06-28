package twopointerslidingwindow.medium;

public class MaxConjugativeOnes_QN2_LNQ_1004 {

    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int i = 0, zeroCount = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroCount++;
            }

            // shrink window until valid
            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
