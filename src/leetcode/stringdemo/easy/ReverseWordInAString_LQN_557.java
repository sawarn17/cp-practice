package leetcode.stringdemo.easy;

public class ReverseWordInAString_LQN_557 {

    public static String reverseWords(String s) {
        char [] temp = s.toCharArray();
        int i=0, j = temp.length-1;
        while(i<j){
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return new String(temp);
    }
    
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String [] str = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String t : str){
            result.append(reverseWords(t)).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
