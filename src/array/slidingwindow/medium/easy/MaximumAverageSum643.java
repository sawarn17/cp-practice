package array.slidingwindow.medium.easy;

public class MaximumAverageSum643 {

    public static double findMaxAverage(int[] nums, int k) {
        int i=0, j=0;
        double max = Integer.MIN_VALUE;
        double sum =0;

        while(j<k){
            sum += nums[j++];
        }

        max = sum/k;

        while(j<nums.length){
            sum += nums[j] -nums[i];
            max = Math.max(max, sum/k);
            i++;
            j++;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k=4;
 
        double result = findMaxAverage(arr, k);
        System.out.println("THE MAX SUM ARE "+ result);
     }
    
}