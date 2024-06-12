package array.medium;

public class SortColors75 {

    static void swapArray(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swapArray(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swapArray(nums, mid, high--);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);

        for(int i: arr){
            System.out.print(i +" ,");
        }
    }
    
}
