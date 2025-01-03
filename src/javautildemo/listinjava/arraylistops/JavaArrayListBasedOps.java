package javautildemo.listinjava.arraylistops;

import java.util.ArrayList;

public class JavaArrayListBasedOps {
	/*
	 * =========================================== ArrayList ============================================
	 * Build in java.util package
	 * it is built on top of the array which dyamically grow and shirnks
	 * Accessing by index ||  starting index is 0
	 * 
	 * Random access takes O(1) time
	 * Adding element takes amortized constant time O(1)
	 * Inserting/Deleting takes O(n) time
	 * Searching takes O(n) time for unsorted array and O(log n) for a sorted one
	 * ArrayList is not Synchronized. || inherits AbstractList class and implements the List interface
	 * 
	 * There are three constructor to initilized it
	 * 		ArrayList<String> defaultCons = new ArrayList<>();
	 * 		ArrayList<String> consWithSize = new ArrayList<>(5);
	 * 		ArrayList<Object> consWithCollection = new ArrayList(collections);
	 * 
	 * Important:-
	 * 		Duplicates Are Allowed. || Insertion order preserve || Heterogeneous Object not allowed || 
	 * 		Default size 10 || Accept null insertion || 
	 * 
	 * Why we use it:- it is slower than the primitive array[]
	 *  	frequent data retrievals || Data access and storage is very efficient
	 *  	Inefficient memory utilization. || Generally used for storing and accessing of the data in app
	 *  	Insertion operation is slow. || Less memory is used.
	 *  	Deletion is too costly || Static Memory allocation || 
	 * 
	 */
	
	public static void main(String [] args) {
		ArrayList<Integer> arrayListEg = new ArrayList<Integer>();
	}
}
