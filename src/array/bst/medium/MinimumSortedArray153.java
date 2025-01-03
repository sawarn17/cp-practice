package array.bst.medium;

//153. Find Minimum in Rotated Sorted Array
public class MinimumSortedArray153 {

    public static int findMin(int [] nums){
        int start=0, end=nums.length-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return nums[end];
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
       try {
        int min = findMin(arr);
        System.err.println("The min value is"+ min);
       } catch (Exception e) {
        e.printStackTrace();
       }
    }
}
