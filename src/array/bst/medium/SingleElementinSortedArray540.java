package array.bst.medium;

public class SingleElementinSortedArray540 {

    public static int singleNonDuplicateWithXor(int[] nums) {
        int x = 0;
        for (int i : nums) {
            x = x ^ i;
        }
        return x;
    }

    public static int singleNonDuplicate(int nums[]) {
        int start = 0, end = nums.length - 1;
        int mid=0;

        // while (start < end) {
        //     int mid = start + (end - start) / 2;
        //     boolean isEven = (end - mid) % 2 == 0;

        //     if (nums[mid] == nums[mid + 1]) {
        //         if (isEven) {
        //             mid = mid + 2;
        //         } else {
        //             mid = mid - 1;
        //         }
        //     } else if (nums[mid] == nums[mid - 1]) {
        //         if (isEven) {
        //             mid = mid - 1;
        //         } else {
        //             mid = mid - 1;
        //         }
        //     } else {
        //         return nums[mid];
        //     }
        // }

        while(start < end) {
            mid = start + (end-start)/2;
            boolean isEven = (end-mid)%2==0;
            
            if(nums[mid] == nums[mid+1]) {
                if(isEven) {
                    start = mid+2;
                } else {
                    end = mid-1;
                }
            } else if(nums[mid] == nums[mid-1]) {
                if(isEven) {
                    end = mid-2;
                } else {
                    start = mid+1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        // System.out.println("THIS IS WITH XOR :"+ singleNonDuplicateWithXor(arr));
        System.out.println("THIS IS CALL WITH Binary SEARCH :" + singleNonDuplicate(arr));
    }
}
