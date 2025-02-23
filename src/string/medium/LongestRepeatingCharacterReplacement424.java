package string.medium;

public class LongestRepeatingCharacterReplacement424 {

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // Check if window is valid
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int characterReplacementV2(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);

            // If the window size minus maxFreq is greater than k, shrink window
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

            // Early exit condition
            if (s.length() - left <= maxLength) {
                break;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;

        try {
            System.out.println(characterReplacement(str, k));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
