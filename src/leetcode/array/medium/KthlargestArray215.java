package leetcode.array.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthlargestArray215 {

    public static int getKthLargestNumberApp1(Integer arr[], int k){
        Arrays.sort(arr, Comparator.reverseOrder());
        return arr[k-1];
    }

    public static int getKthLargestNumberByLambda(Integer [] arr , int k){
        Arrays.sort(arr, (a, b) -> b -a);
        return arr[k-1];
    }

    public static int findKthLargest(Integer[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add(n);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    
    public static void main(String[] args) {
        Integer arr [] = {3,2,1,5,6,4};
        int k= 2;
        System.out.println("THE KTH LARGEST NUMBER IN ARRAY "+ getKthLargestNumberApp1(arr, 2));
        System.out.println("KTH ELEMENT BY LAMBDA "+ getKthLargestNumberByLambda(arr, k));
        System.out.println("THE Kth Largest Number using Priority Queue are "+ findKthLargest(arr, k));
    }
}
