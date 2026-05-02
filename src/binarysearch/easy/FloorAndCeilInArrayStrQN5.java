package binarysearch.easy;

public class FloorAndCeilInArrayStrQN5 {
	
	private static int getFloorAndCeilOfArray(int[] arr, int x, boolean isUpperBound) {
    int left = 0, right = arr.length - 1, res = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == x) {
            res = mid;
            if (isUpperBound)
                left = mid + 1;   // move right
            else
                right = mid - 1;  // move left
        } else if (arr[mid] < x) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return res;
}
	
	public static void main(String[] args) {
		int [] nums = {5,7,7,8,8,10};
		int target = 8;
		int floor = getFloorAndCeilOfArray(nums, target, false);
		int ceil = getFloorAndCeilOfArray(nums, target, true);
	}
}
