package hashmapcumhashset.medium;

import java.util.HashMap;
import java.util.Map;

public class TotalCharacterInStringAfterTransformation3535 {

    private final int M = 1_000_000_007;

    public static int lengthAfterTransformations(String s, int t) {
        
        int freq [] = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int j=1; j<=t; j++){
            int temp[] = new int[26];
        }

        return 0;
    }

    public static void main(String[] args) {
        String st = "abcyy";
        int target = 2;
        System.out.println(lengthAfterTransformations(st, target));
    }
    
}
