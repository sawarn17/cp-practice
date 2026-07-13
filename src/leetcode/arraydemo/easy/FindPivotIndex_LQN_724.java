package leetcode.arraydemo.easy;

public class FindPivotIndex_LQN_724 {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Stores the sum of elements to the left of the current index.
        int leftSum = 0;

        // Step 2: Traverse the array and check every index.
        for (int i = 0; i < nums.length; i++) {

            // Right sum = Total sum - Current element - Left sum
            int rightSum = totalSum - leftSum - nums[i];

            // If both sums are equal, current index is the pivot.
            if (leftSum == rightSum) {
                return i;
            }

            // Include current element in the left sum for the next iteration.
            leftSum += nums[i];
        }

        // No pivot index exists.
        return -1;
    }

    /*
     * Intuition:
     * ----------
     * A pivot index is an index where:
     * 
     * Sum of all elements on the left
     * ==
     * Sum of all elements on the right
     * 
     * Instead of calculating the left and right sums for every index
     * (which would take O(n²) time), we use the following observation:
     * 
     * 1. Compute the total sum of the array once.
     * 2. Maintain a running left sum while traversing.
     * 3. At every index:
     * 
     * rightSum = totalSum - leftSum - nums[i]
     * 
     * 4. If leftSum == rightSum, we've found the pivot index.
     * 5. Otherwise, include nums[i] in leftSum and continue.
     */
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
