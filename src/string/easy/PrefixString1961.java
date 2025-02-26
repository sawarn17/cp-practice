package string.easy;

public class PrefixString1961 {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String t : words) {
            sb.append(t);
        }

        String st = sb.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != st.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrefixStringV2(String s, String[] words) {
        int index = 0, n = s.length();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (index == n)
                    return false;
                if (s.charAt(index++) != c)
                    return false;
            }
            if (index == n)
                return true;
        }

        return index == n;
    }

    public static void main(String[] args) {
        String s = "a";
        String[] words = { "aa", "i", "love", "leetcode" };
        System.out.println(isPrefixStringV2(s, words));
    }    
}
