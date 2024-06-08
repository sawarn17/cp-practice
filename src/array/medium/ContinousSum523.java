package array.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinousSum523 {
    /*
     * MAIN CONCEPT IN THIS QUECTION ARE 
     * If i have a number and we have to find the modulues of that numnber and 
     * add number in future in them and we are getting the same remainder it means that
     * the recently added number are multiple of k 
     * 
     * for eq: arr[] = {23,2,4,6,7} and k =6
     * 
     * first time 
     *   sum + arr[0] 23 % k = 5
     * 
     * second 
     *   sum + arr[i] % k => 25%6 = 1
     * 
     * third 
     *  sum + arr[i] % k => 29 % 6 = 5:::::::::::::matching of remainder
     * 
     * so that the multiple of k are alredy present in the our array having lenegth > 2;
     * 
     * 
     */

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum =0;

        for(int i=0; i< nums.length; i++){
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) {
                remainder += k;
            }
            if(map.containsKey(remainder)){
               int index =  map.get(remainder);
               if(i - index >= 2){
                return true;
               }
            }
            map.put(remainder, i);
        }


        return false;
    }

    //working correctly
    public static boolean cheakSumBYChatGPT(int nums[] , int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Initialize with sum 0 at index -1
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) {
                remainder += k;  // Make sure the remainder is positive
            }
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                if (i - index >= 2) {  // Check if the subarray length is at least 2
                    return true;
                }
            } else {
                map.put(remainder, i);  // Only put the remainder in the map if it's not already present
            }
        }

        return false;

    }



    public static void main(String[] args) {
        int [] ar = {5,0,0,0};
        int sum = 3;
        System.out.println("IS SUM ARE "+ cheakSumBYChatGPT(ar, sum));
    }
    
}
