package searching.bstdemo;

import java.util.Arrays;

public class MinimumTimeToRepairCars294 {
    private static boolean isPossible(int[] ranks, long mid, int cars) {
        long carsRepaired = 0;
        for (int rank : ranks) {
            carsRepaired += (long) Math.sqrt(mid / (double) rank);
            if (carsRepaired >= cars)
                return true; // Early exit
        }
        return false;
    }

    public static long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks); // Sorting helps to work with smaller numbers first
        long l = 1;
        long r = (long) cars * cars * ranks[ranks.length - 1];

        while (l < r) {
            long mid = l + (r - l) / 2;
            if (isPossible(ranks, mid, cars)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] ranks = { 4, 2, 3, 1 };
        int cars = 10;
        System.out.println(repairCars(ranks, cars));
    }
}
