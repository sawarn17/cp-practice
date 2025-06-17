package math.easy;

public class PlusOne66 {

    public static int[] plusOne(int[] digits) {
        int len = digits.length-1;

        for(int i=len; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] =0;
            }
        }
        int newInt [] = new int[len+2];
        newInt[0] =1;
        return newInt;

    }
    
    /*
     * Approach:
     * 
     * Run the run array from the last index to first increses the value.
     * if some value is 9 then will be increse the value and size of array also
     * 
     */
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] res = plusOne(arr);
        
        for(int i : res){
            System.out.println(" "+i);
        }
    }
}
