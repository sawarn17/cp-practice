package slidingwindows.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mapp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(mapp.contains(nums[i])){
                return true;
            }
            mapp.add(nums[i]);

            if (mapp.size() > k) {
                mapp.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
