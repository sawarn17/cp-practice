package array.medium;

import java.util.Arrays;

public class MaxPairOfSumInArray1679 {

    public static int getSumOfNumber(int [] nums, int k){
        int res=0, left=0, right = nums.length-1;

        Arrays.sort(nums);
        while(left<right){
            if(nums[left] + nums[right] < k){
                left++;
            }else if(nums[left] + nums[right] > k){
                right--;
            }else{
                left++;
                right--;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {3,1,3,4,3};
        System.out.println(getSumOfNumber(nums, 6));
    }
    
}
