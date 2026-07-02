package strivers.binarysearch.medium;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FindFirstAndLastOccurranceLQN34 {

    // public static int getBoundFromBST(int [] args, int target, boolean isUpper){
    //     return 0;
    // }

    // public static int[] searchRange(int[] nums, int target) {
    //     return new int [] {
    //         getBoundFromBST(nums, target, false),
    //         getBoundFromBST(nums, target, true)
    //     };
    // }
    
    public static byte[]  getBase64Value(String st){
        return Base64.getEncoder().encode(st.getBytes(StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        //int [] res = searchRange(nums, target);

        System.out.println("Data Are "+ getBase64Value("mw_user_uat:HFC@0987!"));
    }
}
