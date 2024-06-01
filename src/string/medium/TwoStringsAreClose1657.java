package string.medium;

import java.util.Arrays;

public class TwoStringsAreClose1657 {
    
    public static boolean closeStrings(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        if(len1 != len2){
            return false;
        }

        int [] wrd1 = new int[26];
        int [] wrd2 = new int[26];

        for(int i=0; i<len1; i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            wrd1[ch1 - 'a']++;
            wrd2[ch2 - 'a']++;
        }

        for(int i=0; i<len1; i++){
            if((wrd1[i] != 0 && wrd2[i]!=0) || (wrd1[i] ==0 && wrd2[i]==0)){
                return false;
            }
        }

        Arrays.sort(wrd1);
        Arrays.sort(wrd2);
        
        return Arrays.equals(wrd1, wrd2);
    }

    public static void main(String[] args) {
        
    }
}
