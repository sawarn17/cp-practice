package array.easy;

import java.util.Arrays;

public class MinimumNumberToMove2027 {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int totalMove = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        int len = seats.length, i = 0;
        while (i < len) {
            totalMove += Math.abs(students[i] - seats[i]);
            i++;
        }

        return totalMove;
    }

    public static int minMovesToSeatWithoutSorting(int[] seats, int[] students) {
        int totalMove = 0;

        int[] avilableSeat = new int[101];
        int[] avilableStudents = new int[101];

        for (int i : seats) {
            avilableSeat[i]++;
        }

        for (int i : students) {
            avilableStudents[i]++;
        }

        int i = 1, j = 1;

        while (i < avilableSeat.length && j < avilableStudents.length) {

            while (i < avilableSeat.length && avilableSeat[i] == 0) {
                i++;
            }

            while (j < avilableStudents.length && avilableStudents[j] == 0) {
                j++;
            }

            if (i < avilableSeat.length && j < avilableStudents.length) {
                int moveCount = Math.min(avilableSeat[i], avilableStudents[j]);
                totalMove += moveCount * Math.abs(i - j);
            
                avilableSeat[i] -= moveCount;
                avilableStudents[j] -= moveCount;
            }
        }

        return totalMove;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 1, 5, 9 };
        int[] arr2 = { 1, 3, 2, 6 };

        System.out.println(minMovesToSeatWithoutSorting(arr1, arr2));
    }
}
