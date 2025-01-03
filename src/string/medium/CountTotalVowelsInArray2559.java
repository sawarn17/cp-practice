package string.medium;

import java.util.List;

public class CountTotalVowelsInArray2559 {

    // public static boolean isVowel(Character ch) {
    //     switch (Character.toLowerCase(ch)) {
    //         case 'a':
    //         case 'e':
    //         case 'i':
    //         case 'o':
    //         case 'u':
    //             return true;
    //         default:
    //             return false;
    //     }
    // }

    static boolean isVowel(Character c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int [] count = new int[words.length];
        int [] res = new int[queries.length];

        for(int i=0; i<words.length; i++){
            int temp =0;
            if(!words[i].isBlank() && isVowel(words[i].charAt(0))
             && isVowel(words[i].charAt(words[i].length()-1))){
                temp =1;
            }
            
            count[i] = (i == 0) ? temp : count[i - 1] + temp;
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = count[end] - (start > 0 ? count[start - 1] : 0);
        }

        return res;
    }
    
    public static void main(String[] args) {
       String [] words = {"aba","bcb","ece","aa","e"};
       int [] []  queries = {{0,2},{1,4},{1,1}};

       vowelStrings(words, queries);
    }
}
