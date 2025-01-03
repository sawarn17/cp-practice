package array.medium;
//this is two sum
public class TwoSum167 {

    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length-1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{i + 1, j+1};
            }
            if(sum > target){
                --j;
            }
            if(sum < target){
                ++i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr [] = {2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }
}
