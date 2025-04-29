package twopointer.medium;

import java.util.Arrays;

public class NumberOfSubsequence1498 {

    //not working as per expected
    public static int numSubseqV1(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        int res = 0;


        while(i<=j){
            if(nums[i]+ nums[j] == target){
                res += Math.pow(2, (j-i));
                i++;
            }else{
                j--;
            }
        }

        return res;
    }

    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        
        int mod = 1_000_000_007;
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for (int m = 1; m < n; m++) {
            pow[m] = (pow[m - 1] * 2) % mod;
        }
        
        int result = 0;
        int i = 0, j = n - 1;
        
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                result = (result + pow[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {3,3,6,8};
        int target = 9;

        System.out.println(numSubseq(nums, target));
    }
    
}
