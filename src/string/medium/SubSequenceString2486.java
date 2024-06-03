package string.medium;

public class SubSequenceString2486 {

    public static int appendCharacters(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int i = 0, j = 0;

        //used char array to removed the string to character conversions
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        //here we are mentioned j and i both to terminate loop earlier.
        while (i < sLen && j < tLen) {
            if (sChars[i] == tChars[j]) {
                j++;
            }
            i++;
        }
        return tLen - j;
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coding"));
    }
}
