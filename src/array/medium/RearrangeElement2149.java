package array.medium;

public class RearrangeElement2149 {

    public static int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length / 2];
        int negindex = 0, posindex = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] > 0) {
                pos[posindex] = nums[i];
                posindex++;
            } else {
                neg[negindex] = nums[i];
                negindex++;
            }
            i++;
        }
        posindex = 0;
        negindex = 0;
        i = 0;
        while (i < nums.length) {
            if (i % 2 == 0) {
                nums[i++] = pos[posindex++];
            } else {
                nums[i++] = neg[negindex++];
            }
        }
        return nums;
    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // it not preserved array
    public static int[] rearrangeArrayv2(int nums[]) {
        int i = 0, j = nums.length - 1, posIndex = 0, negIndex = 1;
        while (i <= j) {
            if (nums[i] >= 0) {
                i++;
            } else {
                swap(nums, i, j);
                j--;
            }
        }
        i = 0;
        while (i < nums.length) {

        }
        return nums;
    }

    public static int[] rearrangeArrayv3(int nums[]) {
        int n = nums.length;
        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        // rearrangeArray(arr);
        // rearrangeArrayv2(arr);
        rearrangeArrayv3(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
