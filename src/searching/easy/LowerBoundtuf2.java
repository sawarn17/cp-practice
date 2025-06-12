package searching.easy;

public class LowerBoundtuf2 {

    //same just oppose of the upper bound in the array
    public static int lowerBound(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int res = nums.length; // Initialize to length (insert position at the end)

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(lowerBound(nums, x));
    }
}
