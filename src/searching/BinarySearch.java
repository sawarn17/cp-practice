package searching;

public class BinarySearch {
    
    //iterative Approach
    public static int iterativeBinarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) { // Corrected this line to compare arr[mid] with target
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Target is not found in the array
    }
    

    public static int recursiveBinarySearch(int [] arr, int left, int right, int target){
        if(left <= right){
            int mid = left + (right-left) /2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                recursiveBinarySearch(arr, left, mid-1, target);   
            }else{
                recursiveBinarySearch(arr, mid+1, right, target); 
            }
        }
        return -1;
    }


    //fetures of binary search
    //time comlixity Time Complexity: O(log N) Auxiliary Space: O(1)
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target =10;
        System.out.println(iterativeBinarySearch(arr, target));

        System.out.println("RECURSIVE BINARY SEARCH"+ recursiveBinarySearch(arr, 0, arr.length-1, target));
    }
}
