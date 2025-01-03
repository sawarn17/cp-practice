package string.medium;

public class MaximumNumberOfVowel1456 {

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {
        int maxCOunt = 0;
        int i = 0, len = s.length(), j = 0;

        int count = 0;
        while (j < len) {

            char ch = s.charAt(j);
            if (isVowel(ch)) {
                count++;
            }

            if ((j - i + 1) == k) {
                maxCOunt = Math.max(maxCOunt, count);
                char ich = s.charAt(i);
                if (isVowel(ich)) {
                    count--;
                }
                i++;
            }

            j++;
        }

        return maxCOunt;
    }

    public static void main(String[] args) {
        String str = "abciiidef";
        System.out.println(maxVowels(str, 3));
    }
}
