package string.easy;

public class RotateString796 {

    //when we concante any string with itself then it can contains all possible 
    //combination of the substrings
    public static boolean rotateString(String s, String goal) {
        String temp = s + s;
        return temp.contains(goal);
    }
    
    public static void main(String[] args) {
       String s = "abcde",  goal = "cdeab";
       System.out.println(rotateString(s, goal));
    }
}
