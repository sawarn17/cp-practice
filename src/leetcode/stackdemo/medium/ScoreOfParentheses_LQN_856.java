package leetcode.stackdemo.medium;

import java.util.Stack;

public class ScoreOfParentheses_LQN_856 {

    //here i am using the Integer of the stack : bcz when case (A) arrives
    //as per mentioned that : we have to calculate like 1*2 of its values
    //similar i have been updated the values in the stacks.
    public static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int v = st.pop();
                int score = (v == 0) ? 1 : 2 * v; //** IMP */
                st.push(st.pop() + score);
            }
        }
        return st.pop();
    }

    public static void main(String [] args){
        String str = "()()";
        System.out.println(scoreOfParentheses(str));
    }
}
