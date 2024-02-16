package leetCode.simplequections;

import java.util.Stack;

class Solution {

    boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (!st.isEmpty() && st.peek() == '(' && c == ')') {
                    st.pop();
                } else if (!st.isEmpty() && st.peek() == '{' && c == '}') {
                    st.pop();
                } else if (!st.isEmpty() && st.peek() == '[' && c == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String st = "]";
        System.out.println(isValid(st));
    }
}
