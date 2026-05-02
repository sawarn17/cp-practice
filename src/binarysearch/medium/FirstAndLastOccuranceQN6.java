package binarysearch.medium;

//Leetcode 34. Find First and Last Position of Element in Sorted Array
public class FirstAndLastOccuranceQN6 {

    private int getFirstAndLastOcuurance(int [] nums, int target, boolean leftMost){
        int left=0, right = nums.length -1, res = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                res = mid;
                if(leftMost)
                    right = mid-1;
                else
                    left = mid+1;
            }else if(nums[mid] < target)
                left = mid+1;
            else 
                right = mid-1;
        }
        return res;
    }
    
    public int[] searchRange(int[] nums, int target) {
        return new int[]{getFirstAndLastOcuurance(nums, target, true), getFirstAndLastOcuurance(nums, target, false)};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FirstAndLastOccuranceQN6 solution = new FirstAndLastOccuranceQN6();
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and Last Occurrence: [" + result[0] + ", " + result[1] + "]");
    }
}
