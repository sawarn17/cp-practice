package hashmapcumhashset.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ReplaceWords608 {

    public static String getString(String s , HashSet<String> set){
        for(int i=0; i<s.length(); i++){
            String temp = s.substring(0, i);
            if(set.contains(temp)){
                return temp;
            }
        }
        return s;
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> dic = new HashSet<>(dictionary);

        String st [] = sentence.split(" ");

        for(String s : st){
            sb.append(getString(s, dic));
        }

       
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence = "the cattle was rattled by the battery";
        List<String> dicList = Arrays.asList("cat","bat","rat");

        System.out.println(replaceWords(dicList, sentence));
    }
}
