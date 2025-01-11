package string.medium;

public class ConstructKPalindromicNumber1400 {
    /*
     * We can construct maxiumn Plaindromic String which is length of String
     * for eg : String str = "abcd" then we can get maximum plaindromic about to 4
     * length
     * Every Character have been uniquely palindromic of itself like "abc" a , b , c
     * are uniquly plaindromic of itself
     * 
     * ood character decides the rule of plaindromic string
     * if total number of odd unique character count is greter than k then it is not
     * possible to make k plaindromic
     * 
     * odd frequency charater count <= k then might be possiblity it is true
     * 
     */

    public static boolean canConstruct(String s, int k) {
        int stringLen = s.length();

        if (stringLen < k) {
            return false;
        }

        if (stringLen == k) {
            return true;
        }

        int charsCount[] = new int[26];

        for (int i = 0; i < stringLen; i++) {
            charsCount[s.charAt(i) - 'a']++;
        }

        int oddCount = 0;
        for (int count : charsCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= k;
    }

    public static void main(String[] args) {
        String str = "annabelle";
        int k = 2;
        System.out.println(canConstruct(str, k));
    }

}
