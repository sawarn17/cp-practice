package array.easy;

public class MajorityElement169 {

    public static int majorityElement(int[] nums) {
        int count = 0, element = 0;
        for (int num : nums) {
            if (count == 0) {
                count++;
                element = num;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }


    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    
}
