package string.easy;

public class ReverseVowel345 {

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch== 'e' || 
        ch == 'i' || ch == 'o' || ch =='u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
        || ch == 'U'){
            return true;
        }
        return false;
    }

    public static String reverseVowels(String s) {
        char ch [] = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<=j){
            if(!isVowel(ch[i])){
                i++;
            }else if(!isVowel(ch[j])){
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }

    public static String reverseVowelsV2(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(chars[i])) {
                i++;
            }
            while (i < j && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println("THE REVERSE WORD ARE "+ reverseVowels(str));
        System.out.println("THE OPTIMSED VERSION ARE "+ reverseVowelsV2(str));
    }
}
