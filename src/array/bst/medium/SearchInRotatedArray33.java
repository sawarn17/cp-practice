package array.bst.medium;

public class SearchInRotatedArray33 {

    /*
     * Here we need to split in two parts and each of them are in sorted order
     * 
     * find the minimum element in sorted array and then proceed.
     * 
     * 
     */

    public static int getMinMumElemetIndex(int [] nums){
        int left=0, right = nums.length-1;
        while(left<right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left  =mid +1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int pivot = getMinMumElemetIndex(nums);
        if(nums[pivot] == target){
            return pivot;
        }

        int index = -1;
        index = binarySearch(nums, target, pivot+1, nums.length-1);

        if(index != -1){
            return index;
        }else{
            index = binarySearch(nums, target, 0, pivot -1);
        }

        return index;
    }

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 4;

        System.out.println(search(nums, target));

    }
    
}
