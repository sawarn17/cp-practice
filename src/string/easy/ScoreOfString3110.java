package string.easy;

public class ScoreOfString3110 {

    public static int scoreOfString(String s) {
        int score=0;
        int length = s.length();

        for(int i=1; i<length; i++){
            score += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        
        return score;
    }

    public static void main(String[] args) {
        System.out.println("THE SCORE OF STRING ARE "+ scoreOfString("zaz"));
    }
    
}
