package twopointer;

import java.util.Arrays;

public class MinimizeMaxiumPairOfSum1877 {

    private static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int min =0, i=0, j=nums.length-1;
        while(i<j){
            min = Math.max(min, (nums[i]+ nums[j]));
            i++;
            j--;
        }
        return min;
    }


    public static void main(String[] args) {
        int [] arr = {3,5,4,2,4,6};
        System.out.println(minPairSum(arr));
    }
    
}
