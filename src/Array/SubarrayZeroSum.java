package Array;

import java.util.*;

public class SubarrayZeroSum {

    public static void main(String[] args) {

        //check if subarray with 0 sum is exists or not
        // input - {3,4,-7,3,1,3,1,-4,-2,-2}
        // output - the sub arrays with 0 sum exists

        int[] arr = {3,4,-7,3,1,3,1,-4,-2,-2};
        if (zeroSumSubArray(arr)){
            System.out.println("Subarray exists");
        }else {
            System.out.println("Subarrray do not exists");
        }

        //printing sub arrays
        printallSubarrays(arr);

    }

    public static boolean zeroSumSubArray(int[] arr){

        //Time Complexity - O(n)
        //Auxillary Space - O(n)

        Set<Integer> set = new HashSet();
        int sum = 0;
        set.add(0);

        for (int i : arr){
            sum += i;
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void printallSubarrays(int[] arr){

        //the time complexity of this is O(n^3) as there are n^2 sub arrays and
        // it takes O(n) time to find sum of elements...
       for (int i = 0; i < arr.length; i++){

           int sum = 0;

           for (int j = i; j < arr.length ; j++) {

               sum += arr[j];

               if (sum == 0){
                   System.out.println("Subarray [" + i +".."+ j +"]");
               }
           }
       }
    }
}
