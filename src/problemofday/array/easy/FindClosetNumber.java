package problemofday.array.easy;

// this is used to find the closet number
public class FindClosetNumber {

    public static int getClosetNumber(int [] arr, int k, int n){
        int firstCloest=-1;
        int start=0, end=n-1, mandiff=Integer.MAX_VALUE;

        while(start<=end){
            int mid = start + (end - start)/2;

            int diff = Math.abs(arr[mid] - k);

            // if(diff < mandiff){
            //     mandiff = diff;
            //     firstCloest= mid;
            // }else if (diff == mandiff && mid < firstCloest) {
            //     firstCloest = mid;
            // }

            if(arr[mid] == k){
                return k;
            } else if(arr[mid] < k){
                return mid;
                //start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return firstCloest;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 6,7};
        System.out.println("RESULT:::::::::::"+getClosetNumber(arr, arr.length, 4));
    }
}
