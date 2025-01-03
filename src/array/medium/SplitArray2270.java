package array.medium;

public class SplitArray2270 {

    /*
     * If i have total sum then we can esily find the all the sum
     * by using total sum - left sum on each iteration
     * 
     */
    public static int waysToSplitArray(int[] nums) {
        int leftSum =0, res=0;
        long total=0;
        for(int temp : nums){
            total+=temp;
        }
        
        for(int i=0; i<nums.length-1; i++){
            leftSum+=nums[i];
            if(leftSum >= total-leftSum){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums [] = {0,0};//{10,4,-8,7};
       int res = waysToSplitArray(nums);
       System.out.println("THE RES ARE "+ res);
    }
    
}
