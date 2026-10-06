package striverdsa.arraydemo.easy;

public class MissingNumber_LQN_268 {

    public static int missingNumberApp1(int[] nums) {
        // int sum = n * (n+1)/2;
        int total = nums.length * (nums.length + 1) / 2;

        int temp = 0;
        for (int i : nums) {
            temp += i;
        }

        return total - temp;
    }

    // Using XOR properties:
    // a ^ a = 0
    // a ^ 0 = a
    public static int missingNumberApp2(int[] nums) {
        int n = nums.length;
        int res = n;

        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumberApp2(nums));
    }
}
