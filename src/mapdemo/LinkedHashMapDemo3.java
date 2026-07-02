package mapdemo;

public class LinkedHashMapDemo3 {

    /*
    The LinkedHashMap class is very similar to HashMap in most aspects. 
    However, the linked hash map is based on both hash table and linked list to enhance the functionality of hash map.

    
    */

    /*
        LRU CACHING BUILDING

        LinkedHashMap provides a special constructor which enables us to specify, among custom load factor (LF) and initial capacity, a different ordering mechanism/strategy called access-order:
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, .75f, true);// size loadfactor and recent used data
        **last param is the ordering mode. So, by passing in true, we turned on access-order, whereas the default was insertion-order.
    */

    public static void main(String[] args) {
        
    }
    
}
