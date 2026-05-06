package extracurriculum.array.matrix.medium;

public class RotateImage_LQN48 {

    private static void printTheElements(int[][] nums) {
        for (int[] is : nums) {
            for (int temp : is) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    //transpose matrix i start from 0 and j starts from i+1
    private static void transPoseOfMatrix(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void swappingOfArray(int [] arr){
        int start=0, end = arr.length-1;
        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    private static void rotateArrayRowByRow(int [][] matrix){
        int len = matrix.length;
        for(int i=0; i<len; i++){
            swappingOfArray(matrix[i]);
        }
    }

    public static void rotate(int[][] matrix) {
        transPoseOfMatrix(matrix);
        rotateArrayRowByRow(matrix);
    }

    /* 4May26
     * Approach: 90 Rotate ClockWise Direction
     * Step 1: Make transpose of matrix
     * Step 2: Reverse element row by row.
     * 
     * How to Transpose Element:
     * Diagonally Swap the elements
     * 
     */
    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        
        printTheElements(matrix);
        rotate(matrix);
        System.out.println("---------------------------------------------------");
        printTheElements(matrix);
    }
}
