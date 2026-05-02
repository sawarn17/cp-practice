package binarysearch.medium;

public class CountOccurnaceInSortedArray7 {

    //main logic is here we have to find the first and last occurrence of the target element in the sorted array and then calculate the count by subtracting the indices of last and first occurrence and adding 1 to it.
    // and subtracting from last and first occurrence we will get the count of the target element in the sorted array. 
    private static int countOccurrences(int[] arr, int target) {
        int firstIndex = findFirstOccurrence(arr, target);
        if (firstIndex == -1) {
            return 0; // Target not found
        }
        int lastIndex = findLastOccurrence(arr, target);
        return lastIndex - firstIndex + 1;
    }

    private static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    private static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        int count = countOccurrences(arr, target);
        System.out.println("Count of " + target + " is: " + count);
    }
}
