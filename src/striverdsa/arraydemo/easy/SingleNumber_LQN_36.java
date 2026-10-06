package striverdsa.arraydemo.easy;

public class SingleNumber_LQN_36 {

    // we are using the property of the XOR when two elements are same then xor of that number is zero
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
