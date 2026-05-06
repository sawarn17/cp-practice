package binarysearch.medium;

public class FindHowManyTimeArrayIsRotated_QN9 {

    private static int findMinElemenetIndex(int [] arr){
        int start=0, end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;

            //main concept here if array of mid is bigger than arr of right
            //then we need to lookup in the right side sub array
            if(arr[mid] > arr[end])
                start = mid+1;
            else
                end = mid; //points to notice here
        }
        return start;
    }

    private static int howManyTimeArrayIsRotated(int [] arr){
        return findMinElemenetIndex(arr);
    }
    
    /*
    Approach :

    */
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2}; //{4,5,6,7,0,1,2,3};
        System.out.println(howManyTimeArrayIsRotated(arr));
    }
}
