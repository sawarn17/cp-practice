package string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> sStr = new HashMap<>();
        Map<Character, Character> tStr = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (sStr.containsKey(charS) && sStr.get(charS) != charT) {
                return false;
            }

            if (tStr.containsKey(charT) && tStr.get(charT) != charS) {
                return false;
            }

            sStr.put(charS, charT);
            tStr.put(charT, charS);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "badc", str2 = "baba";
        System.out.println(isIsomorphic(str1, str2));
    }

}
