package string.easy;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAdjecentDups1047 {

    public static String getRemovedAdjecentElements(String str) {
        Stack<Character> st = new Stack<>();
        for (Character ch : str.toCharArray()) {
            System.out.println(ch);
            if (st.isEmpty()) {
                st.push(ch);
            } else {
                if (st.peek() != ch) {
                    st.push(ch);
                } else {
                    st.pop();
                }
            }
        }
        return st.stream().map(String::valueOf).collect(Collectors.joining());
    }

    static String removeAdjacentDuplicatesV2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
                sb.append(ch);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(getRemovedAdjecentElements(s));
        System.out.println(removeAdjacentDuplicatesV2(s));
    }
}
