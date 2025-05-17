package slidingwindows.medium;

public class MinimumSizeSubArraySum209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;

        //find the window that sustisfied length is equal to the target
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            //caculate sum until the catch the window

            //need to shrink the window
            while (sum >= target) {
                min = Math.min(min, j - i + 1);// correct window length will be (j-i)+1
                sum -= nums[i];
                i++;
            }
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };

        System.out.println(minSubArrayLen(target, nums));
    }

}
