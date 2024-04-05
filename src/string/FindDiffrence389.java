package string;
/*
 *  3 Approaches for it
 *  1. By using the map
 *  2. by calculating sum of the character
 *  3. by using xor
 */
public class FindDiffrence389 {

    public static char findTheDifference(String s, String t) {
        int sum1=0, sum2=0;
        for(int i=0; i<= s.length()-1; i++){
            sum1 += s.charAt(i);
        }
        for(int i=0; i<= t.length()-1; i++){
            sum2 += t.charAt(i);
        }
        return sum1 > sum2 ? (char) (sum1-sum2) : (char) (sum2 - sum1);
    }

    public static char findTheDifferenceWithXor(String s, String t) {
        int xor =0;
        for(char ch : s.toCharArray()){
             xor ^= ch;
        }
        for(char ch : t.toCharArray()){
             xor ^= ch;
        }
        return (char) xor;
     }

    public static void main(String[] args) {
        System.out.println("THE DIFFRENCE OF CHARCTER " +findTheDifference("abcd", "abcde"));
        System.out.println("THE DIFFRENCE OF CHARCTER " +findTheDifferenceWithXor("abcd", "abcde"));
    }
}
