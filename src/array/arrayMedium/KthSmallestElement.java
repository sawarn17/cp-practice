package array.arrayMedium;

import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int getKthSmallestNumber(int [] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //adding an element to a queue
        for(int i=0; i< arr.length; i++){
            pq.offer(arr[i]);
        }

        System.out.println("THE ADDED ELEMENT ARE"+ pq);
        return 0;
    }
 
    public static void main(String[] args) {
        int [] arr = {7,10,4,3,20,15};
        int k =3;
        System.out.println("The Kth Smallest Number are "+ getKthSmallestNumber(arr, k));
    }
}
