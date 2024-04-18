package string.easy;

import java.util.Arrays;
import java.util.Objects;

public class AnagramCheck242 {

    public static boolean isAnagramString(String s1, String s2){
        if(Objects.isNull(s2) || Objects.isNull(s1) || s1.length() != s2.length()){
            return false;
        }else{
            char [] ch = s1.toCharArray();
            char [] ch2 = s2.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch2);
            return Arrays.equals(ch, ch2);
        }
    }

    public static boolean isAnagramOptimsed(String s1, String s2){
        if(Objects.isNull(s2) || Objects.isNull(s1) || s1.length() != s2.length()){
            return false;
        }else{
            int [] temp = new int[26];
            for(char tempc : s1.toCharArray()){
                temp[tempc - 'a']++;
            }
            for (char temp1 : s2.toCharArray()) {
                temp[temp1 - 'a']--;
            }

            for(int i : temp){
                if(i!=0){
                    return false;
                }
            }
            return true;
        }
    }
 
    public static void main(String[] args) {
        String str1 = "anagram", str2 = "nagaram";
        System.out.println("IS ANAGRAM "+ isAnagramString(str1, str2));
        System.out.println("IS ANAGRAM "+ isAnagramOptimsed(str1, str2));
    }
}
