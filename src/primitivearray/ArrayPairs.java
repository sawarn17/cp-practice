package primitivearray;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairs {
	
	public static void printAllPairOfSum(int sum, int [] arr) {
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]+ arr[j] ==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	
	//optimised code
	public static void printAllPairOfSumInEfficentWay(int sum, int [] arr) {
		Map<Integer, Integer> mapped = new HashMap();
		for(int i=0; i<arr.length; i++) {
			int leftSum = sum - arr[i];
			if(mapped.containsKey(leftSum)) {
				System.out.println(arr[i] +" "+ leftSum);
			}else {
				mapped.put(arr[i], i);
			}
		}
	}
		
	public static void main(String [] args) {
		int[] arr = {4, 6, 5, -1, 7, 3, 1, 9, 2, 8};
		//printAllPairOfSum(12, arr);
		printAllPairOfSumInEfficentWay(12, arr);
	}
}
