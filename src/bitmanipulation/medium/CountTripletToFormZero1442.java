package bitmanipulation.medium;

import java.util.HashMap;

public class CountTripletToFormZero1442 {

    public static int countTriplets(int[] arr) {
        int[] prefixXor = new int[arr.length + 1];

        // Initializing the first element to 0
        prefixXor[0] = 0;

        // Compute prefix XOR
        for (int i = 1; i <= arr.length; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i - 1];
        }

        int triplets = 0;

        // Count the triplets
        for (int i = 0; i < prefixXor.length; i++) {
            for (int k = i + 1; k < prefixXor.length; k++) {
                if (prefixXor[k] == prefixXor[i]) {
                    triplets += k - i - 1;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 7 };
        System.out.println(countTriplets(arr));
    }
}
