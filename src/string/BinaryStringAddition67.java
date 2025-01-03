package string;

public class BinaryStringAddition67 {
    public static String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0) {
           int sum = carry; // Start with carry
           if (len1 >= 0) {
               sum += a.charAt(len1--) - '0';
           }
           if (len2 >= 0) {
               sum += b.charAt(len2--) - '0';
           }
   
           carry = sum / 2; 
           sum = sum % 2; 
           sb.append(sum); 
       }
       if(carry !=0){
           sb.append(carry);
       }
       return sb.reverse().toString();
       }

       public static void main(String[] args) {
            System.out.println("AddBinary "+ addBinary("11", "1"));
       }

}
