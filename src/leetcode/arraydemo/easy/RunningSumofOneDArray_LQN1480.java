package leetcode.arraydemo.easy;

public class RunningSumofOneDArray_LQN1480 {

    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
           //nums[i] = nums[i-1]+ nums[i];
           nums[i] += nums[i - 1];
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        runningSum(nums);
        for(int tt : nums){
            System.out.print(tt + " ");
        }
    }
}
