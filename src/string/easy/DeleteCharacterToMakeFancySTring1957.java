package string.easy;

public class DeleteCharacterToMakeFancySTring1957 {

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabaaaa";
        System.out.println(makeFancyString(str));
    }
}
