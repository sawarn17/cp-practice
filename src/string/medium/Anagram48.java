package string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram48 {

    // Array of first 26 prime numbers corresponding to each alphabet
    private static final int[] PRIMES = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
            89, 97, 101
    };

    private static long getPrimeProduct(String str) {
        long product = 1;
        
        for (char ch : str.toCharArray()) {
            product *= PRIMES[ch - 'a'];
        }
        
        return product;
    }

    public static String genrateString(String str) {
        StringBuilder sb = new StringBuilder();
        int count[] = new int[26];

        for (char ch : str.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            sb.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Map<String, List<String>> result = new HashMap<>();
        String st[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        for (String s : st) {
            String temp = genrateString(s);

            if (!result.containsKey(temp)) {
                result.put(temp, new ArrayList<>());
            }

            result.get(temp).add(s);
        }
        System.out.println(result.values());
    }
}
