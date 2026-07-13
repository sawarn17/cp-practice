package leetcode.arraydemo.easy;

public class MergeSortedArray_LQN_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            temp[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        // Copy merged array back to nums1
        for (int x = 0; x < temp.length; x++) {
            nums1[x] = temp[x];
        }

        // Print result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}
