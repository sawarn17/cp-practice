package string.medium;

public class ReverseSentence151 {

    private static String reverseString(String str){
        char ch [] = str.toCharArray();
        int i=0, j=str.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            ++i;
            --j;
        }
        return new String(ch);
    }

    private  static String reverseUsingDoublePointer(String str){
        String firstRev = reverseString(str);
        char [] ch = firstRev.toCharArray();
        int i=0, r=0, l=0, len = firstRev.length()-1;
        while(i<len){
            if(ch[i] != ' '){
                ++i;
                ++r;
            }else{
                
            }
        }
       return new String(ch);
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseUsingDoublePointer(str));
    } 
}
