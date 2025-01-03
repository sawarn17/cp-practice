package string.medium;

public class CountAndSay38 {

    public static String getCountAndSayString(int num) {
        if(num==1){
            return String.valueOf(num);
        }else{
            String str = getCountAndSayString(num-1);

            for(int i=0; i< str.length()-1; i++){
                
            }

            return null;
        }
    }

    public static void main(String[] args) {
        String str = "1211";
        int n = 4;

        System.out.println("THE COUNT AND SAY ARE" + getCountAndSayString(n));
    }
}
