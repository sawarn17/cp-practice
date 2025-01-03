package array.basic;

public class BasicArryFindingofPic {
    public static int peakElement(int[] arr, int n) {
        int index = 0, max = 0, i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        // System.out.println(max);
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 21 };
        System.out.println(peakElement(arr, arr.length));
    }

}
