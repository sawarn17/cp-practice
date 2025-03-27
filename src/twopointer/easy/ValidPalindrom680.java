package twopointer.easy;

public class ValidPalindrom680 {

    private static boolean isPlainDrom(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return (isPlainDrom(s, i + 1, j) || isPlainDrom(s, i, j - 1));
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        try {
            System.out.println("::::::" + validPalindrome(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
