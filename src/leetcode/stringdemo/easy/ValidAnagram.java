package leetcode.stringdemo.easy;

import java.util.Objects;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (Objects.isNull(s) || Objects.isNull(t) || s.length() != t.length()) {
            return false;
        } else {
            int[] temp = new int[26];
            for (char tempc : s.toCharArray()) {
                temp[tempc - 'a']++;
            }
            for (char temp1 : t.toCharArray()) {
                temp[temp1 - 'a']--;
            }

            for (int i : temp) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

    }
}
