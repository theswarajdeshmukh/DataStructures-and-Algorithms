package Array;

import java.util.Arrays;
import java.util.Random;

/**
 Shuffle an array using Fisher–Yates shuffle algorithm

Given an integer array, in-place shuffle it. The algorithm should produce an unbiased permutation i.e,
 every permutation is equally likely

 */


public class FisherYatesAlgorithm {

    // swapping
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to shuffle an array `arr[]`
    public static void shuffle(int[] arr) {

        // read array from highest index to lowest
        for (int i = arr.length - 1; i >= 1; i--) {

            Random random = new Random();

            // generate rand_index between 0 and last_index
            int j = random.nextInt(i+1);

            // swap the current element with the randomly generated index
            swap(arr,i,j);
        }
    }


    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5, 6 };

        shuffle(A);

        // print the shuffled array
        System.out.println(Arrays.toString(A));
    }
}
