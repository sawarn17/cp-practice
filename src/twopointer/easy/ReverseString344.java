package twopointer.easy;

public class ReverseString344 {

    public static void reverseString(char[] s) {
        int i=0, j=s.length-1;

        while(i<j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char [] temp = {'h', 'e', 'l', 'l', 'o'};
        reverseString(temp);
        for(char ch : temp){
            System.out.println(ch);
        }
    }
    
}
