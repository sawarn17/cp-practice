package leetcode.binarysearch.medium;

public class SearchInRoatatedSearchArray81 {

    private static int getMinimumNumberIndex(int [] nums, int target){
        int start =0, end = nums.length -1;
        while(start< end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end])
                start = mid +1;
            else
                end = mid;

        }
        return end;
    }

    private static int getElementByBinarySearch(int [] nums, int target, int left, int right){
        while(left<right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]< target)
                left = mid+1;
            else
                right = mid -1;
        }
        return -1;
    }

    public static boolean search(int[] nums, int target) {
        int pivot = getMinimumNumberIndex(nums, target);
        if(nums[pivot] == target)
            return true;
        int index =-1;
        index = getElementByBinarySearch(nums, target, pivot+1, nums.length-1);
        if(index != -1)
            return true;
        index = getElementByBinarySearch(nums, target, 0, pivot-1);
        if(index != -1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    
}
