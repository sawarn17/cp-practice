package string.easy;

public class PanagramString1832 {

    public static boolean checkIfPangram(String sentence) {
        int[] occur = new int[26];
        for (char c : sentence.toCharArray()) {
            int index = c - 'a';
            occur[index]++;
        }

        for (int i : occur) {
            if (i == 0) {
                return false;
            }
        }
        return true;

    }

    //it just process the string in the same loop 
    public static boolean checkIfPangramV1(String sentence) {
        boolean[] occur = new boolean[26];
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                if (!occur[index]) {
                    occur[index] = true;
                    count++;
                    if (count == 26)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
}
