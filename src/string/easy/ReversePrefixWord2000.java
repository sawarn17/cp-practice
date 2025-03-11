package string.easy;

public class ReversePrefixWord2000 {

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1)
            return word;
        char [] temp = word.toCharArray();
        int i=0;
        while(i<index){
            char t = temp[i];
            temp[i] = temp[index];
            temp[index] = t;
            i++;
            index--;
        }
        return new String(temp);
    }

    public String reversePrefixV2(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) return word;
    
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1)).reverse();
        return sb.append(word.substring(index + 1)).toString();
    }
    

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
    
}
