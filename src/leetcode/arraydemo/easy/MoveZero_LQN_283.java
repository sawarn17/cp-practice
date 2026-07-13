package leetcode.arraydemo.easy;

public class MoveZero_LQN_283 {

    private static void swapNumber(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void moveZeroes(int[] nums) {
        int j = nums.length-1;
        for(int i=0; i<j; i++){
            if(nums[i] ==0){
                swapNumber(nums, i, j);
                j--;
            }
        }
    }

    //instead of swaping of 0 we can swap non zero elements
    public void moveZeroesV2(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapNumber(nums, j, i);
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int t : nums){
            System.out.print(t + " ");
        }
    }
}
