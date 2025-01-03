package string.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromString409 {

    public static int getLongestPlainDrom(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        
        int result = 0;
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                set.remove(ch);
                result += 2;
            } else {
                set.add(ch);
            }
        }
        
        if(!set.isEmpty()) {
            result++;
        }
        
        return result;
    }

   
    public static void main(String[] args) {
        System.out.println("This is method 1" + getLongestPlainDrom("abccccdd"));
    }
}
