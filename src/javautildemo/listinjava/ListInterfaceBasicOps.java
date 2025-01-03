package javautildemo.listinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *========================================List Interfce Ops==========================================
 *
 */

public class ListInterfaceBasicOps {
	public static void main(String [] args) {
		List<Integer> integerArrayList = new ArrayList<>();
		integerArrayList.addAll(Arrays.asList(1, 2,3,4,5, 6, 7, 8, 9, 10));
		//basic operation on it
		
		//integerArrayList.add(11);//adding an element to list
		//System.out.println("the list data after adding element are"+ integerArrayList);
		//the list data after adding element are[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
		
//		integerArrayList.add(6, 12);
//		System.out.println(integerArrayList);
//		[1, 2, 3, 4, 5, 6, 12, 7, 8, 9, 10, 11] adding on 7th postion and rest data sfifted to right
		
		
		//integerArrayList.addAll(8, integerArrayList);
		//System.out.println(integerArrayList);
		//[1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 10] adding on first list index with second one entire list.
		
//		Object clone = integerArrayList.clone();
//		cloning of object return-type RT is Objet
		
		
		//boolean operation based
		//System.out.println(integerArrayList.contains(6));// returns true
		//System.out.println(integerArrayList.isEmpty()); //returns false
		//integerArrayList.clear();//return void clean all the elements of the list.
		//integerArrayList.add(null);
		//System.out.println(integerArrayList.isEmpty());//returns false because on 0 index null is present
		//System.out.println(integerArrayList.size());//returns 1
		//System.out.println(integerArrayList.remove(1));//returns how many elements are removed from the list outPut : 2
		//System.out.println(integerArrayList.removeIf(data -> data%2==0));//returns true or false
		//System.out.println(integerArrayList); //removed all the even numbers [1, 3, 5, 7, 9]
		//System.out.println(integerArrayList.removeAll(integerArrayList));
		
		
		
	}
}
