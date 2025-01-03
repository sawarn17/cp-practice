package stackimpl.medium;

import java.util.Stack;

public class RemovingSpecailCharacter2390 {

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }else{
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String removeStarsWithoutStack(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }
}
