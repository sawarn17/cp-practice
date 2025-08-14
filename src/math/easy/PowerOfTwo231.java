package math.easy;

public class PowerOfTwo231 {

    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        while(n>0){
            if(n%2 == 0){
                n = n/2;
                if(n==0 || n==1)
                    return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPowerOfTwoV2(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
 
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }
}
