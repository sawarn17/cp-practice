package math.medium;

public class SumOfSquare633 {

    public static boolean judgeSquareSum(int c) {
        if(c <0){
            return false;
        }else{
            long left= 0;
            long right = (int) Math.sqrt(c);

            while(left<=right){
                long sum = left*left + right*right;

                if(sum == c){
                    return true;
                }else if(sum <c){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }

    //integer oevrflow happens so that deals in long value
    public static boolean judgeSquareSumGPT(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
    
        while (left <= right) {
            long sum = left * left + right * right;
    
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
    
        return false;
    }
    

    public static void main(String[] args) {
        int c = 2147483600;
        System.out.println(judgeSquareSum(73));
    }
    
}
