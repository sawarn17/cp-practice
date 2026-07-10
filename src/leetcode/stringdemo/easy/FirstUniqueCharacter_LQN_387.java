package leetcode.stringdemo.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter_LQN_387 {

    public static int firstUniqCharNotWorking(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char t : s.toCharArray()){
             map.merge(t, 1, Integer::sum);
        }

        return map.entrySet().stream()
              .filter(data -> data.getValue().equals(1))
              .map(Map.Entry::getKey)      // Get the character
              .findFirst()                  // Get the first unique one
              .map(s::indexOf)              // Find its index in the original string
              .orElse(-1); 
    }

    public static int firstUniqChar(String s) {
        int [] data = new int[26];
        char [] input = s.toCharArray();
        for(char t : input){
            data[(t - 'a')]++;
        }

        for(int i= 0; i<input.length; i++){
            if(data[input[i] - 'a'] ==1)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
