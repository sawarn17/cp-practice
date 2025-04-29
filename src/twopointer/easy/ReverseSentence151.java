package twopointer.easy;

public class ReverseSentence151 {

    // private static void reverseString(char[] ch, int i, int j) {
    //     while (i < j) {
    //         char temp = ch[i];
    //         ch[i] = ch[j];
    //         ch[j] = temp;
    //         ++i;
    //         --j;
    //     }
    // }

    // private static String reverseUsingDoublePointer(String str) {
    //     char[] ch = str.toCharArray();
    //     reverseString(ch, 0, ch.length - 1);

    //     int i = 0, left = 0, right = 0;
    //     int len = ch.length;
    //     while (i < len) {
    //         while (i < len && ch[i] != ' ') { // i ko agar char dikha to r ko dega and i++ and r++
    //             ch[right++] = ch[i++];
    //         }
    //         if (left < right) {
    //             reverse(s.begin() + l, s.begin() + r);

    //             s[r] = ' ';
    //             r++;

    //             l = r;
    //         }

    //         i++;
    //     }

    //     return new String(ch);
    // }

    private static void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    public  static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        sb.reverse();
        
        int n = sb.length();
        int i = 0;
        int l = 0, r = 0;

        while (i < n) {
            while (i < n && sb.charAt(i) != ' ') {
                sb.setCharAt(r++, sb.charAt(i++));
            }
            
            if (l < r) {
                reverse(sb, l, r - 1);
                if (r < n) {
                    sb.setCharAt(r++, ' ');
                }
                l = r;
            }
            i++;
        }
        
        // Remove the last extra space if any
        if (r > 0 && sb.charAt(r - 1) == ' ') {
            r--;
        }
        
        return sb.substring(0, r);
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
}
