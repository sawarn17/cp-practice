package mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {

    /*
     * TreeMap in Java is a Red-Black tree-based NavigableMap implementation that
     * stores its key-value
     * pairs in a strictly sorted, balanced binary search tree order.
     * It guarantees O(logn) time complexity for containsKey, get, put, and remove
     * operations.
     * 
     * 
     * Internally, TreeMap relies on a Red-Black Tree.
     * Each key-value pair is stored inside a TreeMap.Entry<K,V> node object.
     * 
     * Every node in a TreeMap contains six primary fields:
     * 1. Key (K key): The unique lookup identifier.
     * 2. Value (V value): The data payload.
     * 3. Left (Entry<K,V> left): Pointer to the left child node.
     * 4. Right (Entry<K,V> right): Pointer to the right child node.
     * 5. Parent (Entry<K,V> parent): Pointer to the parent node.
     * 6. Color (boolean color): Represents the node's color (true for Black, false
     * for Red).
     * 
     * -----------------------------------------------------------------------------
     * -------------------------
     * Governing Red-Black RulesTo maintain its self-balancing nature during
     * insertions and deletions,
     * TreeMap strictly enforces these five rules:
     * 1. Every node is either Red or Black.
     * 2. The Root node is always Black.
     * 3. All Leaf nodes (represented as null) are Black.
     * 4. If a node is Red, both of its children must be Black (No consecutive Red
     * nodes).
     * 5. Every path from a node to any of its descendant leaf nodes must contain
     * the same number of Black nodes (Black-height rule)
     ******************************************************************************************************************
     * 
     * How Key Operations Work Internally:
     * 
     * 1. Put Operation (put(K key, V value))Tree Traversal:
     * - The algorithm starts at the root node.
     * - Comparison: It compares the target key against the current node's key using
     * Comparable.compareTo() or a custom Comparator.
     * - Branching:
     * 1. If the target key is smaller, it moves left.
     * 2. If larger, it moves right. If equal, it overwrites the value and exits.
     * 3. Insertion: When it hits a null pointer, it inserts the new node as a Red
     * node.
     * 4. Rebalancing: If the parent of the new node is also Red, it violates the
     * Red-Black rules.
     * TreeMap invokes internal helper methods fixAfterInsertion(Entry<K,V> x) to
     * perform Left/Right Rotations and Color Flips until the rules are restored.
     * 
     * 
     * 2. Get Operation
     * 1. It executes a standard binary search tree lookup starting from the root.
     * 2. It compares keys at each node using compareTo() or compare().
     * 3. It navigates down the tree until a match is found O(log n) or it hits null
     * (log n).
     * 4. Important: Unlike HashMap, TreeMap does not use hashCode() or equals().
     * Two keys are considered identical if and only if compare(key1, key2) == 0
     * 
     * 
     * Core Internal Methods
     * TreeMap relies heavily on precise bitwise adjustments and pointer
     * manipulations:
     * - rotateLeft(Entry<K,V> p): Pivots tree pointers to the left around node p to
     * balance a heavy right subtree.
     * - rotateRight(Entry<K,V> p): Pivots tree pointers to the right around node p
     * to balance a heavy left subtree.
     * - fixAfterInsertion(Entry<K,V> x): Fixes rule violations post-insertion via
     * color changes and rotations.
     * - fixAfterDeletion(Entry<K,V> x): Re-balances the tree structure after a node
     * removal.
     * 
     */

    /**
     * Demonstrates how TreeMap automatically sorts Integer keys in their natural
     * ascending order.
     * Integers are sorted numerically from lowest value to highest value.
     */
    private static void treeMapNaturalOrder() {
        // Instantiate a TreeMap where Integer keys are automatically sorted
        TreeMap<Integer, Integer> naturalOrder = new TreeMap<>();

        // Populate the map with 11 random integer values
        for (int i = 0; i <= 10; i++) {
            // Generates a random integer between 0 and 99
            int val = (int) (Math.random() * 100);

            // Using the same random integer for both key and value
            naturalOrder.put(val, val);
        }

        // Print the map to console, showing keys sorted from lowest to highest
        System.out.println(naturalOrder);
        //OP : {8=8, 10=10, 26=26, 28=28, 36=36, 43=43, 63=63, 71=71, 75=75, 77=77, 88=88}
    }

    /*
     * TreeMap is a map implementation that keeps its entries sorted according to
     * the natural ordering of its **keys
     * 
     */
    public static void main(String[] args) {
        treeMapNaturalOrder();
    }
}
