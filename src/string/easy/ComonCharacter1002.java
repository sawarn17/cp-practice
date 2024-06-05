package string.easy;

import java.util.ArrayList;
import java.util.List;
public class ComonCharacter1002 {

    public static void fillCountArray(String word, int[] count) {
        int length = word.length()-1;

        for(int i=0; i<=length; i++){
            count[word.charAt(i) - 'a']++;
        }
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] count = new int[26];
        int n = words.length;
        
        fillCountArray(words[0], count);
        for (int i = 1; i < n; i++) {
            int[] temp = new int[26];
            fillCountArray(words[i], temp);

            for (int j = 0; j < 26; j++) {
                count[j] = Math.min(count[j], temp[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    result.add(String.valueOf((char) (i + 'a')));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String ch[] = {"bella","label","roller"};
        try {
            System.out.println(commonChars(ch));
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
