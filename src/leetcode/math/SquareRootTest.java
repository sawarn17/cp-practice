package leetcode.math;

//leetcode qn 56 Square Root
public class SquareRootTest {

    public static int getSquareRootOfaNumber(long number){
        if(number < 2){
            return (int)number;
        }else{
            long start=0, end = number, ans=0;
            while(start < end){
                long mid = start + (end -start)/2;
                if(mid * mid == number){
                    return (int) mid;
                }else if( mid * mid < number){
                    start = mid +1;
                    ans = mid;
                }else{
                    mid = end -1;
                }
            }
            return (int) ans;
        }
    }

    public static void main(String [] args){
      int x = 8;
      System.out.println("SQUARE ROOT OF A NUMBER ARE "+ getSquareRootOfaNumber(x));
    }
}
