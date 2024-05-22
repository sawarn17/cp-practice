package array.medium;

import java.util.List;

public class FindFirstAndLastElementInsortedArray34 {

    public static int getIndexOfFirstOccurance(int[] arr, int target, boolean isLeftmost) {
        int low = 0, high = arr.length - 1;
        int mostSingnificant = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                mostSingnificant = mid;
                if (isLeftmost) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return mostSingnificant;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        List<Integer> result = List.of(getIndexOfFirstOccurance(arr, 7, true),
         getIndexOfFirstOccurance(arr, 7, false));
        System.out.println(result);
    }
}
