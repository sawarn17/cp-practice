package striverdsa.binarysearch.easy;

//this is 2nd of BS
public class LowerBoundUpperBoundBS2 {

    //this is also on GFG and Leetcode question
    private static int lowerBound(int[] nums, int target) {
      int left =0, right=nums.length-1, ans = nums.length;
      while(left<=right){
        int mid = left + (right -left)/2;
        if(nums[mid] >= target){
            ans = mid;
            right = mid-1; // moving towards left
        }else {
            left = mid + 1;
        }
      }
      return ans;
    }


    private static int upperBound(int[] nums, int target) {
        int ans = nums.length;
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] > target){
                ans = mid;
                right = mid -1; //move left
            }else{
                left = mid +1;// move right
            }
        }

        return ans;
    }

    
    public static void main(String[] args) {
        int [] nums = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        System.out.println(lowerBound(nums, target));
        System.out.println(upperBound(nums, target));
    }
}
