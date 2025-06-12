package searching.easy;

public class SearchInsertPostion35 {

    //same problem as lower and upper bound
    public static int searchInsert(int[] nums, int target) {
        int res = nums.length;
        
        int start=0, end = nums.length-1;
        while (start <= end) {
            int mid = end - (end - start)/2;
            if(nums[mid]>= target){
                res = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 5;
        int res = searchInsert(arr, target);
        System.out.println("THE DATA IN RESULT " + res);
    }
}
