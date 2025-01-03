package bitmanipulation.medium;

public class NoOfStepForBinaryRepresentationOne1404 {

    public static void addOne(StringBuilder s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != '0') {
            s.setCharAt(i, '0');
            i--;
        }

        if (i < 0) {
            s.insert(0, '1');
        } else {
            s.setCharAt(i, '1');
        }
    }

    public static int numSteps(String s) {
        int op = 0;
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 1) {
            int n = sb.length();

            if (sb.charAt(n - 1) == '0') {
                sb.deleteCharAt(n - 1);
            } else {
                addOne(sb);
            }

            op++;
        }

        return op;
    }

    public static int numStepsV2(String s) {
        int op = 0;
        int carry = 0;
        int n = s.length();

        for (int i = n - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) {
                // If s[i] + carry is 1, we need to add 1 to make it even
                carry = 1;
                op += 2; // One for adding 1 and one for dividing by 2
            } else {
                // If s[i] + carry is 0 or 2, just divide by 2
                op++;
            }
        }

        // If carry is 1, we need one additional operation
        return op + carry;
    }


    public static void main(String[] args) {
        String s = "1101";
        System.out.println("THE NUMBER OF BIT REDUCED TO GET THE ONE IS" + numSteps(s));
        System.out.println(numStepsV2(s));
    }
}
