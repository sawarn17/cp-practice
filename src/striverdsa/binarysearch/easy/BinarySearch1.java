package strivers.binarysearch.easy;

public class BinarySearch1 {

    //this for the simple binary search
    //for left most value search go to the gfg sheet 
    private static int binarySearch(int[] nums, int target) {
        int start=0, end = nums.length-1;
        while(start<=end){
            //we need to findout the mid of the array
            int mid = start + (end - start)/2;
            if(nums[mid]== target)
                return mid;
            //if value of mid is lesser than the target then we need to search in higher value
            else if(nums[mid]< target){
                start = mid +1;
            }else{
                //if value of mid is greater than the target then we need to search in higher value
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 5;
        System.out.println(binarySearch(nums, target));
    }

}
