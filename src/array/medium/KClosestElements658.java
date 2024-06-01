package array.medium;

import java.util.ArrayList;
import java.util.List;

// we have to find the all kth closest element from the array
public class KClosestElements658 {

    //here we have to find the total kth closest element and x is the number 
    public static List<Integer> getAllKthCloesetElemet(int [] nums, int k, int x){
        List<Integer> result = new ArrayList<>();

        int start =0, end=nums.length-1; 
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == x){
                result.add(nums[mid]);
            }else if(nums[mid] < x){
                result.add(nums[mid]);
                k--;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return result;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k=4, x=3;

        System.out.println(getAllKthCloesetElemet(nums, k, x));
    }
}
