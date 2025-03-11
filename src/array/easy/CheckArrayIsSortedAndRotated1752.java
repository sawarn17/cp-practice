package array.easy;

public class CheckArrayIsSortedAndRotated1752 {

    private static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }
        
        // Check last and first element to consider the rotation case
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        
        return count <= 1;
    }
    
    
    public static void main(String[] args) {
     int [] nums ={3,4,5,1,2};   
     System.out.println(check(nums));
    }
}
