package array.medium;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {

    public static int minIncrementForUnique(int[] nums) {
        int moves =0;

        Arrays.sort(nums);

        //here we are cheking the current elements is lesser or equals prevous element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] + 1 - nums[i];
                nums[i] += increment;
                moves += increment;
            }
        }

        return moves;
    }
 
    
    public static void main(String[] args) {
        int [] arr = {3, 2, 1, 2, 1, 7};
        System.out.println(minIncrementForUnique((arr)));
    }
}