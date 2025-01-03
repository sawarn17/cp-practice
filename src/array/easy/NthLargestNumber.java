package array.easy;

import java.util.PriorityQueue;

// here we are using the concepts of priorityqueue for this
public class NthLargestNumber {

    public static int getNthMaximumNumber(int[] arr, int nthMaxNumber){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int temp : arr){
            if(pq.size()> nthMaxNumber){
                pq.poll();
            }
            pq.add(temp);
        }

        return pq.peek();
    }


    public static void main(String[] args) {
        int [] arr = {5, 3, 7, 1, 9, 2, 6, 6, 6, 6}; 
        System.out.println("THE DATA IN THE "+ getNthMaximumNumber(arr, 3));
    }
    
}
