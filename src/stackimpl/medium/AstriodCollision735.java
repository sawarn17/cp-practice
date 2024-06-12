package stackimpl.medium;

import java.util.Stack;

public class AstriodCollision735 {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int len = asteroids.length;

        while (i < len) {
            int temp = asteroids[i];

            while(!st.isEmpty() && st.peek() > 0 && temp <0){
                int sum = st.peek() + temp;
                if(sum < 0){
                    st.pop();
                }else if(sum >0){
                    sum =0;
                    break;
                }else{
                    st.pop();
                    sum =0;
                }
            }

            if(temp != 0){
                st.push(temp);
            }
            i++;
        }

        System.out.println(st);

        int[] result = new int[st.size()];
        for (int m = st.size() - 1; m >= 0; m--) {
            result[m] = st.pop();
        }

        return result;
    }


    public static Stack<Integer> asteroidCollisionV2(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int a : asteroids) {
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int sum = a + st.peek();
                if (sum < 0) {
                    st.pop();
                } else if (sum > 0) {
                    a = 0;
                    break;
                } else {
                    st.pop();
                    a = 0;
                }
            }
            
            if (a != 0) {
                st.push(a);
            }
        }
        
        return st;
    }

    public static void main(String[] args) {
        // int arr[] = { -2, -1, 1, 2 };
        //int[] arr = { 5, 10, -5 };
        int arr [] = {10, 2, -5};
        System.out.println("THE NAME ARE " + asteroidCollisionV2(arr));
    }

}
