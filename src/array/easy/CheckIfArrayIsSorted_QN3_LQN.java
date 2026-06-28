package array.easy;

public class CheckIfArrayIsSorted_QN3_LQN {

    public static boolean check(int[] nums) {
        for(int i= nums.length-1; i>0; i--){
            if(nums[i] < nums[i-1])
                return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(check(nums));
    }
}
