package string.medium;

/*
 * Simple obervation we need atlest 3 elements to delete the elements
 * 
 * Observation 2: Find the frequency of all character
 * For Ood number of frequency it is always be takes 1
 * like if frequency is 9 then 9-2--->7-2--->5-2 ---> (3==3) -2 --->1 finally one comes
 * 
 * For even number always takes 2
 * like 10 is frequency then 10-2 ---> 8 -2 ---> 6 -2 ---> 4 -2 ---> 2 finally two is less than 3 then terminated
 * 
 * And in last add the total numbers
 * 
 */
public class MinimumStringOfArray3223 {

    public  static int minimumLength(String s) {
        int len = s.length();
        int temp[] = new int[26];

        int deleted=0;
        for(int i=0; i<len; i++){
            int index = s.charAt(i) - 'a';
            temp[index]++;
            if(temp[index]==3){
                temp[index] -= 2;
                deleted+=2;
            }
        }

        return len - deleted;
    }


    public static void main(String[] args) {
        String st = "abaacbcbb";
        System.out.println(minimumLength(st));

    }
    
}
