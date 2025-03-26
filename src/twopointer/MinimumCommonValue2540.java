package twopointer;

public class MinimumCommonValue2540 {

    public static boolean isMatched(int min, int [] arr){
        int i=0;
        while(i< arr.length && arr[i]<=min){
            if(arr[i] == min)
                return true;
        }
        return false;
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i< nums1.length && i<nums2.length){
            if(nums1[i]< nums2[i]){
                min = nums1[i];
                if(isMatched(min, nums2))
                    return min;
            }else{
                min = nums2[i];
                if (isMatched(min, nums1)) {
                    return min;
                }
            }
            i++;
        }
        return -1;
    }

    public static int getCommonWithTwoPointer(int[] nums1, int[] nums2) {
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j])
                return nums1[i];
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4};
        int [] arr2 = {1,2};
        System.out.println(getCommonWithTwoPointer(arr1, arr2));
    }
}
