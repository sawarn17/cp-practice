package leetcode.stringdemo.easy;

public class DetecetCapital_LQN_520 {

    public static boolean detectCapitalUse(String word) {
        if (word == null || word.isEmpty())
            return true;
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean detectCapitalUseV2(String word) {
        if (word == null || word.length() <= 1) {
            return true;
        }

        boolean isUpper = Character.isUpperCase(word.charAt(1));

        for (int i = 2; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) != isUpper) {
                return false;
            }
        }

        return !isUpper || Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
}
