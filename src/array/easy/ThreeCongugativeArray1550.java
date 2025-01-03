package array.easy;

public class ThreeCongugativeArray1550 {

    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        int arr2[] = {1,1,1};
        System.out.println(threeConsecutiveOdds(arr2));
    }
}
