package striverdsa.arraydemo.easy;

public class RemoveDuplicateFromSortedArray_LQN_26 {

    public static  int removeDuplicates(int[] nums) {
        if(nums.length ==0)
            return 0;
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
 
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
