package twopointerslidingwindow.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChatarcter_QN1_LQN3 {

    public static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        Set<Character> ch = new HashSet<>();

        int i=0,j=0;
        while(j<s.length()){
            if(!ch.contains(s.charAt(j))){
                ch.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            }else{
                ch.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
