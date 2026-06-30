package mapdemo;

import java.util.HashMap;

public class HashMapDemo1 {

    /*
    Initial CapacityDefault Value:
        16 elements.Constraint: The capacity must always be a power of two ((2^{n})). 
        If you specify a custom initial capacity (e.g., 20), the HashMap constructor runs a bit-shifting algorithm to round it up to the next power of two (which would be 32).Why Power of Two? 
        It optimizes index calculations. Instead of expensive modulo division (hash % capacity), Java uses a bitwise AND operation:

        Formula: 
        Index = hash & (capacity -1);
        Bitwise operations execute much faster at the CPU level.

    
    
    Load FactorDefault Value: 
        0.75 (75%).Purpose: This is a measure of how full the hash table is allowed to get before its capacity is automatically increased. 
        It offers the ideal trade-off between time complexity (lookup speed) and space complexity (memory overhead).
        ThresholdDefinition: The exact number of entries allowed in the map before resizing occurs.Formula

    
        Formula : 
        Threshold  = Initial Capacity * Load Factor;

        Default Calculation: For a default map,  Threshold = 16 * 0.75 = 12 
        The moment the 13th key-value pair is added, the map triggers a resize.
    
    */

    /*
     * Hashing method & Index Determination:
     * When you call put(key, value), Java does not use the raw integer returned by
     * the key's .hashCode() method.
     * It processes it through a secondary bit-shifting function to minimize
     * collisions.
     * 
     * static final int hash(Object key) {
     *  int h;
     * return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
     * }
     * 
     * 
     * Why this exists: 
     * If a map's capacity is small (like 16), only the lowest 4 bits of the hash matter when calculating the bucket index. 
     * If two keys have hash codes that differ only in their upper bits, they will collide.
     * 
     * The Fix: 
     * The bitwise XOR (^) expression shifts the higher 16 bits of the hash down (>>> 16) and mixes them with the lower bits. 
     * This spreads the high-bit variance into the lower bits, preventing collisions in low-capacity maps.
     * 
     */

    /*
    3. Hash Collisions and Java 8 Enhancements
        A hash collision occurs when two completely distinct keys produce the exact same bucket index after hashing and bitwise masking.
        Java 7 and Earlier: 
            Pure ChainingHistorically, HashMap resolved collisions by using a Singly Linked List. 
            Every bucket held a pointer to the head of a linked list.
            The Flaw: If many keys collided in the same bucket, 
                the lookup time degraded from an average of (O(1)) to a worst-case of (O(n)), 
                making it vulnerable to Denial of Service (DoS) attacks via targeted hash collisions.
                
    Java 8+ Performance Enhancements: 
        "Treeification"Java 8 introduced an optimized approach where heavily populated buckets transition into balanced Red-Black Trees (TreeNode). 
        This ensures a worst-case performance of (O(log n)).This transformation is governed by three strict internal constants:java
        
        static final int TREEIFY_THRESHOLD = 8;
        static final int UNTREEIFY_THRESHOLD = 6;
        static final int MIN_TREEIFY_CAPACITY = 64;

        Use code with caution.Treeify Threshold (8): When a linked list inside a single bucket accumulates more than 8 nodes, 
        the JVM prepares to convert that bucket from a linked list into a Red-Black tree.
        Min Treeify Capacity (64): Even if a bucket has 8 nodes, it will not convert to a tree unless the total capacity of the entire HashMap is at least 64. 
        If the total capacity is under 64, Java assumes the map is simply too tightly packed and triggers a standard array resizing instead.
        Untreeify Threshold (6): During removal operations or resizing, if the number of elements inside a balanced tree bucket drops to 6 or fewer, the tree converts back into a standard linked list to save memory.


    
    */

    /*
    4. Resizing and Re-hashing Performance Cost :
        When the total size of the map passes the Threshold, the resize() method is executed.Doubling Capacity: 
        The internal array doubles in size ((16 to 32 to 64)).
        
        The Re-hashing Tax: Every single existing entry in the map must have its bucket index re-evaluated because the capacity - 1 mask has changed.
        
        The Bit-Check Optimization:
            Java 8 optimizes HashMap resizing by avoiding expensive hash recalculations. 
            When the table capacity doubles, a node's new index is either:

                -the same as its old index, or
                -old index + old capacity.


        The algorithm performs a simple bitwise check:
            (hash & oldCapacity) == 0
        
        If the result is 0, the node remains at its current index.
        Otherwise, it moves to old index + old capacity.

        This optimization significantly reduces the overhead of resizing because the hash value does not need to be recomputed for every entry.

        Performance Impact:
            Resizing is an expensive O(n) operation because every existing entry must be redistributed into the new table. If you know in advance how many elements the map will contain, initialize the HashMap with an appropriate capacity to minimize or eliminate resizing.

        For example, if you expect to store 1,000 elements:
            
            Target Capacity= (Expected Elements / load Factor) + 1;

        Since HashMap always rounds the capacity up to the next power of two, you should initialize it with a capacity of 2048:
    */
    
    //It is internally Structure of Array bucket:  (Node<K,V>[] table).
    HashMap<String, String> map = new HashMap<>();//default value is 16 thresh
}
