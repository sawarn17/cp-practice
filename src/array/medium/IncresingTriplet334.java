package array.medium;

public class IncresingTriplet334 {
    
    public static boolean isTriplet(int [] nums){
        int num1= Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        
        
        for(int i=0; i<nums.length; i++){
            int num3 = nums[i];
            if(num3 <= num1){
                num1 = num3;
            }else if(num3<= num2){
                num2 = num3;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int [] arr = {1,2,3,4,5};
        int [] arr = {5,4,3,2,1};

        System.out.println("IS Triplet elements"+ isTriplet(arr));
    }
}
