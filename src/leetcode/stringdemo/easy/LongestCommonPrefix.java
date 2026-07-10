package leetcode.stringdemo.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String temp1= strs[0];
        String temp2= strs[strs.length-1];
        while(i<strs[0].length()){
            if(temp1.charAt(i) != temp2.charAt(i))
                break;
            i++;
        }
        return temp1.substring(0, i);
    }
    
    public static void main(String[] args) {
        String [] strs = {"dog","racecar","car"};
        System.out.println("THE RESULT IS "+longestCommonPrefix(strs));
    }
}
