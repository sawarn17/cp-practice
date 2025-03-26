package twopointer.easy;

public class MoveZero283 {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                ++insertPos;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            ++insertPos;
        }
    }

    public static void main(String[] args) {
        int[] num = { 0, 1, 0, 3, 12 };

        moveZeroes(num);
        for (int i : num) {
            System.out.println(i);
        }
    }

}
