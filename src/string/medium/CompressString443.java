package string.medium;

import java.util.HashMap;
import java.util.Map;

public class CompressString443 {

    public static int compress(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {

            if (!map.isEmpty() && map.containsKey(ch)) {
                Integer temp = map.get(ch);
                map.put(ch, ++temp);
            } else {
                map.put(ch, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }

        return sb.length();
    }

    //leetcode solutiion at 67% beat
    public static int compressString(char[] chars) {
        int i=0, index=0, len = chars.length;
        while(i<len){
            int count =0;
            char currentEle = chars[i];
            while(i<len && chars[i]==currentEle){
                i++;
                count ++;
            }

            chars[index++] = currentEle;

            if(count>1){
                String str = String.valueOf(count);
                for(char ch : str.toCharArray()){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }

// 10 May
    public static void main(String[] args) {
        char[] ch = { 'a', 'a', 'b', 'b', 'c', 'c' };
        //normal count for that
        System.out.println(compress(ch));
        System.out.println(compressString(ch));
        System.out.println("THE NEW STRING ARE " + new String(ch));
    }
}