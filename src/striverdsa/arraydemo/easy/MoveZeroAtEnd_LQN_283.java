package striverdsa.arraydemo.easy;

public class MoveZeroAtEnd_LQN_283 {

    private static void swapNumber(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static  void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapNumber(nums, j, i);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(" " + i);
        }
    }
}
