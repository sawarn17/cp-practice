package leetcode.stringdemo.easy;

public class IsSecquence_LQN_392 {

     public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        int i=0, j=0, slen = s.length(), tlen = t.length();

        while(i<slen && j<tlen){
            //checking here if i character is matched with j character then i will be increases otherwise j
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }

        //if s character is matched in temp then count of i becomes count of j
        return i==slen;
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
    
}
