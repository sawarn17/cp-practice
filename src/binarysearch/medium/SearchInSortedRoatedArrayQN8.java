package binarysearch.medium;

//33. Search in Rotated Sorted Array
public class SearchInSortedRoatedArrayQN8 {

    private static int binarySearch(int[] nums, int target, int left, int right) {
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[left] < target)
                left = mid+1;
            else
                right = mid-1;

        }
        return -1;
    }

    //figuring out the minimum value number ie right most value
    private static int getMinimumElementIndex(int [] nums){
        int left =0, right = nums.length-1;
        while(left<right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return right;
    }

    private static int search(int [] nums, int target){
        int pvt = getMinimumElementIndex(nums);
        System.out.println("VALUE OF PVT : :::"+ pvt);
        if(nums[pvt] == target)
            return pvt;
        int res =-1;

        res = binarySearch(nums, target, 0, pvt);

        if(res != -1)
            return res;
        res = binarySearch(nums, target, pvt, nums.length-1);

        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println(result); // Output: 4
    }
}
