package binarysearch;

public class BinarySerchDemo704 {
    
    public static int binarySearch(int arr[], int n) {
        int i = 0, j = arr.length - 1;
    
        while (i <= j) {
            int mid = i + (j - i) / 2;// remember how to calculte mid
    
            if (arr[mid] == n) {
                return mid;
            }
    
            if (arr[mid] > n) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
    
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5, 6, 7, 8, 9,10};
        int n=5;
        System.out.println(binarySearch(arr, n));//op is 4 bcz array 4th index contain that element
    }
}
