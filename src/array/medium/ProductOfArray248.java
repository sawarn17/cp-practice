package array.medium;

public class ProductOfArray248 {

    public static int [] getProductOfArrayViaDivisionOperation(int [] arr){
        int [] res = new int[arr.length];
        int product = 1;
        for(int i: arr){
            product*= i;
        }

        for(int i=0; i<arr.length; i++){
            res[i] = product/arr[i];
        }

        return res;
    }

    public static int [] getProductOfArrayV2(int [] nums){
        int len = nums.length;
        int res [] = new int[len];
        int left [] = new int[len];
        int right [] = new int[len];

        left[0] = 1;
        right[len -1] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[i];
        }


        return res;
    }
    

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] temp = getProductOfArrayV2(arr);

        for(int i : temp){
            System.out.println(i);
        }
    }
}
