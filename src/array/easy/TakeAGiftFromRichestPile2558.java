package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TakeAGiftFromRichestPile2558 {

    public static long pickGifts(int[] gifts, int k) {
        List<Long> elements = new ArrayList<>(); 
        for(int i=0; i<gifts.length; i++){
            elements.add((long)-gifts[i]);
        }
        //pq is a min heap
        PriorityQueue<Long> minHeap = new PriorityQueue<>(elements);

        while(k-->0 && !minHeap.isEmpty()){
            Long val = -minHeap.poll();
            minHeap.offer(-(long)Math.sqrt(val));
        }

        long total =0;
        while (!minHeap.isEmpty()) {
            total+=-minHeap.poll();
        }
        return total;
    }
    
    public static void main(String[] args) {
        int [] gifts = {25,64,9,4,100};
        int k = 4;

        System.out.println("PICK GIFT "+ pickGifts(gifts, k));

    }
}
