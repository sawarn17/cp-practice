package strivers.binarysearch.easy;

public class FloorAndCeilInSortedArray4 {

    //it is based on the upper bound values
    private static int findFloor(int[] arr, int x) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                ans = mid;
            if (arr[mid] > x) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28, 31, 31, 32, 33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 41, 41, 42, 43, 43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50, 50, 51, 53, 54, 54, 56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94};
        int x = 26;
        System.out.println(findFloor(arr, x));
        // Largest number less than or equal to 5 is 2, whose index is 1.
    }
}
