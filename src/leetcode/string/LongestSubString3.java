package leetcode.string;

import java.util.ArrayList;

public class LongestSubString3 {

    public  static int lengthOfLongestSubstring(String s) {
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
        String str = "abcabcbb";
        System.out.println("LARGEST SUBSTRING ARE "+ lengthOfLongestSubstring(str));
    }
}
