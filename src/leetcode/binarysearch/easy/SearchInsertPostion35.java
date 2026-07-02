package leetcode.binarysearch.easy;

public class SearchInsertPostion35 {

    /*
        Approach
        Step 1: Apply the normal binary search algo
        Step 2: If mid == target then return mid
        Step 3: Other wise return left most value bcz on the left index we can place the number
    
    */
    public static int searchInsert(int[] nums, int target) {
        int left =0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right- left)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                right = mid-1;
            else
                left= mid+1;
        }
        return left;
    }
 
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
