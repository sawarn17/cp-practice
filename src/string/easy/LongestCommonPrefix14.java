package string.easy;

import java.util.Arrays;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int j=0;
        String s1= strs[0];
        String s2 = strs[strs.length-1];

        while(j<s1.length() && j<s2.length()){
            if(s1.charAt(j) != s2.charAt(j)){
                break;
            }
            j++;
        }

        return s1.substring(0, j);
    }

    public static void main(String[] args) {
        String str [] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    
}
