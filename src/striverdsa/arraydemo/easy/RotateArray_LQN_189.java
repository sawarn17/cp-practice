package striverdsa.arraydemo.easy;

public class RotateArray_LQN_189 {

    private static void swap(int [] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int [] nums, int k){
        k %= nums.length;//getting exact value that i have to roatate
        if(k==0)
            return;
        swap(nums, 0, nums.length-1); // swaoing of entire array
        swap(nums, 0, k-1); //swaping of 0 to k
        swap(nums, k, nums.length-1); // now again swaping into k to len-1 : then we get entirely swaped array
    }

    /*
    Left Rotating by k times in the array.
    */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);

        for (int i : nums) {
            System.out.print(" " + i);
        }
    }
}
