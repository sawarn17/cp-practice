package string.easy;

public class FindGreatestCommonDivisior1071 {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static boolean isRepeatingPattern(String str1, String str2) {
        if (str1.length() % str2.length() != 0) {
            return false;
        }
        int repeatCount = str1.length() / str2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            sb.append(str2);
        }
        return sb.toString().equals(str1);
    }

    public static String gcdOfStrings(String str1, String str2) {
        int lengthGCD = gcd(str1.length(), str2.length());
        String candidate = str1.substring(0, lengthGCD);
        if (isRepeatingPattern(str1, candidate) && isRepeatingPattern(str2, candidate)) {
            return candidate;
        } else {
            return "";
        }
    }


    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));  // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));  
    }
}
