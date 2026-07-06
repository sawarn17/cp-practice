package leetcode.stringdemo.easy;

import java.util.ArrayList;

public class LongestSubStringWithoutRepeatcingCharacter_LQN3{

    public static int lengthOfLongestSubstring(String s) {
        int res=0, left=0, right =0;
        ArrayList<Character> temp = new ArrayList<>();
        while(right<s.length()){
            if(temp.contains(s.charAt(right))){
                //array removal is based on the index
                temp.remove((Character) s.charAt(left));
                left++;
            }else{
                temp.add(s.charAt(right));
                right++;
                res = Math.max(temp.size(), res);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}