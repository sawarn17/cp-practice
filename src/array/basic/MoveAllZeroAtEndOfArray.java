package array.basic;

public class MoveAllZeroAtEndOfArray {
	
	public static void getAllArrayAtEndOfArray(int arr []) {
		int lastIndex = arr.length;
		for(int i=0; i< lastIndex; i++) {
			if(arr[i] ==0) {
				int tempIndex = lastIndex-1;
				int temp = arr[tempIndex];
				arr[tempIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String [] args) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		getAllArrayAtEndOfArray(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
