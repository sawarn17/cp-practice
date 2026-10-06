package striverdsa.arraydemo.easy;

public class MaxiumConjugativeOne_LQN_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while(j<nums.length){
            if(nums[j] == 0){
                max = Math.max(max, j- i);
                i=j+1;
            }
            j++;
        }
        //countering last sequence of the elements
        max = Math.max(max, j - i);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
