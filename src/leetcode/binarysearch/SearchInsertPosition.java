package leetcode.binarysearch;

public class SearchInsertPosition {

    //code is optimised but need to be memory optimsed
    public static int getInsertPostion(int nums [], int target){
        int start=0, end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
        int target = 2;
        System.out.println(getInsertPostion(nums, target));
    }
}
