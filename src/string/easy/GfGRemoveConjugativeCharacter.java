package string.easy;

public class GfGRemoveConjugativeCharacter {

    public static String removeConsecutiveCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0, j=1;
        sb.append(s.charAt(i));
        while(j< s.length()){
            if(s.charAt(i) != s.charAt(j)){
                sb.append(s.charAt(j));
                i=j;
            }
            j++;
        }
        return sb.toString();
    }
    

    public static void main(String[] args) {
        String str = "abcddcba";
        System.out.println(removeConsecutiveCharacter(str));
    }
}
