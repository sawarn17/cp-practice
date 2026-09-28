package leetcode.stackdemo.easy;

import java.util.Stack;

public class MaximumDepthOfParentheses_LQN_1614 {

    public static int maxDepth(String s) {
        int max = -1;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                max = Math.max(max, st.size());
                st.pop();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String  str = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str));
    }
}
