package string.easy;

import javax.crypto.spec.ChaCha20ParameterSpec;

public class LargestOddNumber1903 {

    public static String largestOddNumber(String num) {
        Long longNum = Long.parseLong(num);
        int max = 0;
        if (longNum % 2 == 0) {
            for (char ch : num.toCharArray()) {
                int temp = Character.getNumericValue(ch);
                if (temp % 2 == 0) {
                    continue;
                } else {
                    max = Math.max(max, temp);
                }
            }
            return max == 0 ? "" : String.valueOf(max);
        } else {
            return String.valueOf(longNum);
        }
    }

    public static String largestOddNumberV1(String num) {
        if (Long.parseLong(num) % 2 == 0) {
            int max = -1;
            for (char ch : num.toCharArray()) {
                int digit = Character.getNumericValue(ch);
                if (digit % 2 != 0) {
                    max = Math.max(max, digit);
                }
            }
            return max == -1 ? "" : String.valueOf(max);
        }
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        String num = "10133890";
        System.out.println(largestOddNumberV1(num));
    }
}
