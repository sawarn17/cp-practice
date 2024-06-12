package array.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Here we are using cummlative sum of array 
 * Concept is if array is given then  find the sum of each and every consugative number
 * then formula to get the sum of that array are 
 * 
 * int sum = arr[j] - arr[i-1] when condition is applied if i=0 then sum will be directly arr[j]
 * no modification are there
 * 
 * 
 * 
 */
public class SumOfSubArray974 {

    //not working
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum =0;
        int res =0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                sum +=nums[i] + k;
            }else{
                sum += nums[i];
            }
            int rem = sum % k;
            if(map.containsKey(rem)){
                res += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0)+ 1);
        }

        System.out.println("DATA IN MAP ARE "+ map);

        return res;
    }

    //working
    public static int subarraysDivByKV2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
    
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = ((sum % k) + k) % k; // Adjust remainder to always be positive
            res += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
    
        return res;
    }

    //not working
    public static int subarraysDivByKNsquare(int[] nums, int k) {
        int totalSubArray =0;
    
        //genarating cumulative sum not culumative sum will be genrated on only refrenced array
        for(int i=1; i< nums.length; i++){
            nums[i] += nums[i-1];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = i==0 ? nums[j] : nums[j] - nums[i-1];
                if(sum % k ==0){
                    totalSubArray+=1;
                }
            }
        }

        return totalSubArray;
    }

    public static void main(String[] args) {
        //int arr [] = {4,5,0,-2,-3,1}; //{4, 9, 9, 7, 4, 5}
        int arr [] = {-7,2,3,0,-9};
        int sum = 3;

        System.out.println(subarraysDivByKV2(arr, sum));
    }
    
}
