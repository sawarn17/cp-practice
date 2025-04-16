import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {

    public static int lengthOfLongestSubstring(String s) {
        int max=0,left=0, right=0;
        ArrayList<Character> ch = new ArrayList<>();
        while(right < s.length()){
         if(!ch.contains(s.charAt(right))){
             ch.add(s.charAt(right));
             right++;
             max = Math.max(max, ch.size());
         }else{
             ch.remove(Character.valueOf(s.charAt(left)));
             left++;
         }
        }
        return max;
     }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
