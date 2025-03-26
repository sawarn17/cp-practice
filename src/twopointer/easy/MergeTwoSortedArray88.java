package twopointer.easy;

public class MergeTwoSortedArray88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        //start iterating on it
        // filling elemnets from high to low
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        //copying all elements to the nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
        merge(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.println(" " + i);
        }
    }

}
