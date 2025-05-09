package binarysearch.medium;

public class SearchInRoatedArray33 {
    
    public static int search(int[] nums, int target) {
        int i=0, j=nums.length -1;

        while(i<=j){
            int mid = i + (j - i) / 2;

            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                j = mid - 1;
            else
                i = mid+1;
        }

        return -1;
    }


    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target =0;
        
        int n = search(arr, target);
        System.out.println("THE DATA IS "+ n);
    }
}
