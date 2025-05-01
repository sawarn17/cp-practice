package math.easy;

public class FindNumberWIthEvenDigit1295 {

    private static boolean isEven(Integer value){
        return value.toString().length() %2 == 0;
    }

    public static int findNumbers(int[] nums) {
        int totalEven =0;

        int i=0, j=nums.length;

        while(i<j){
            if(isEven(nums[i]))
                totalEven++;
            else if(isEven(nums[j]))
                totalEven++;

            i++;
            j--;
        }

        return totalEven;
    }

    private static boolean isEvenV1(int value) {
        //Math.log10(value) + 1 gives digit count in constant time.
        int digits = (int) Math.log10(value) + 1;
        return digits % 2 == 0;
    }

    public static int findNumbersV1(int[] nums) {
        int totalEven = 0;
        for (int num : nums) {
            if (isEvenV1(num)) {
                totalEven++;
            }
        }
        return totalEven;
    }

    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbersV1(arr));
    }
}
