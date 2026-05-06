package extracurriculum.array.slidingwindow.easy;

import java.util.HashMap;
import java.util.Map;

public class ContinuousHarmoniousArray_LQN594 {
    
    public static int findLHS(int[] nums) {
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for(int temp : nums){
            map.compute(temp, (key, val) -> (val == null) ? 1 : val + 1);
        }

        System.err.println(map);
        for(int temp : map.keySet()){
            if(map.containsKey(temp+1)){
                max = Math.max(max, map.get(temp+1)+ map.get(temp));
            }
        }
        return max;
    }

    /*
    Harmonious means: The diff between highest and lowest value will be 1

    Thought Process:

    Count all frequency and 
    */
    public static void main(String[] args) {
        int [] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
