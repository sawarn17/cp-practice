package string.medium;

public class GetEqualSubstringwithBudget1208 {

    public static int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int maxLen = 0;
        int currCost = 0;
        int start = 0;
    
        for (int end = 0; end < n; end++) {
            currCost += Math.abs(s.charAt(end) - t.charAt(end));
    
            while (currCost > maxCost) {
                currCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
    
            maxLen = Math.max(maxLen, end - start + 1);
        }
    
        return maxLen;
    }
    


    public static void main(String[] args) {
     String s = "abcd", t = "bcdf";
     int  maxCost = 3;
     
     System.out.println(equalSubstring(s, t, maxCost));
    }
    
}
