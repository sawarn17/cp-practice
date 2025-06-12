import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import linkedlist.ListNode;

public class Testing {

    
    public static int search(int[] nums, int target) {
        int start=0, end = nums.length -1;

        while(start<= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid]> target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target =9;
        int temp = search(arr, target);
        System.out.println(temp);
      
    }
}
