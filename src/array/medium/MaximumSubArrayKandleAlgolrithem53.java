package array.medium;

public class MaximumSubArrayKandleAlgolrithem53 {

    public static int getMaximumSubArray(int [] arr){
        int sum=0, max=arr[0];
        for(int temp : arr){
            sum += temp;
            max = Math.max(sum, max);
            if(sum<0){
                sum =0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The Maximum Subarray are "+ getMaximumSubArray(arr));
    }
    
}
