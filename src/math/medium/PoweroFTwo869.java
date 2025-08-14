package math.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PoweroFTwo869 {

    private static HashSet<String> set = new HashSet<>();

     private static String getSortedStr(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean reorderedPowerOf2(int n) {
        String sortedStr = getSortedStr(n);

        // Check all powers of 2 up to 2^29
        for (int p = 0; p <= 29; p++) {
            if (sortedStr.equals(getSortedStr(1 << p))) {
                return true;
            }
        }

        return false;
    }

    private static void buildSet() {
        for (int p = 0; p <= 29; p++) {
            char[] chars = String.valueOf(1 << p).toCharArray();
            Arrays.sort(chars);
            set.add(new String(chars));
        }
    }

    private static boolean reorderedPowerOf2V2(int n){
        if (set.isEmpty()) {
            buildSet(); // Call once
        }

        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return set.contains(new String(chars));
    }
    
    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2V2(10));
    }
}
