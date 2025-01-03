package stackimpl.medium;

import java.util.Stack;

public class DecodedString394 {

    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        int i=0;
        while(i< s.length()){
            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                numStack.push(num);
            }else if (s.charAt(i) == '[') {
                strStack.push(result);
                result = new StringBuilder();
                i++;
            } else if (s.charAt(i) == ']') {
                StringBuilder temp = result;
                result = strStack.pop();
                int count = numStack.pop();
                for (int j = 0; j < count; j++) {
                    result.append(temp);
                }
                i++;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        
        return result.toString();
        
    }


    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    
}
