package simultation.easy;

import java.util.ArrayList;
import java.util.List;

public class DivideStringInKGroup2138 {

    public static String[] divideString(String s, int k, char fill) {
    int n = s.length();
    int lenOfArray = (n + k - 1) / k; // Ensures correct rounding up
    String[] res = new String[lenOfArray];

    for (int i = 0; i < lenOfArray; i++) {
        int start = i * k;
        int end = Math.min(start + k, n);
        String part = s.substring(start, end);

        // Fill with 'fill' character if needed
        if (part.length() < k) {
            StringBuilder sb = new StringBuilder(part);
            while (sb.length() < k) {
                sb.append(fill);
            }
            part = sb.toString();
        }

        res[i] = part;
    }

    return res;
}


    public static void main(String[] args) {
        String str = "abcdefghi";
        int k=3;
        char fill = 'x';
        String [] res = divideString(str, k, fill);

        for(String t : res){
            System.err.println(t);
        }
    }
    
}
