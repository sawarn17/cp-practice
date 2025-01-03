package array.medium;

public class RemoveDuplicatesDupsContain80 {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int temp : nums){
             if(i<2 || temp != nums[i-2]){
                 nums[i++] = temp; 
             }
        }
        return i;
     }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
