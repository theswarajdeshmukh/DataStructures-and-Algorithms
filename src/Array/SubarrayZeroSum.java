package Array;

import java.util.HashSet;
import java.util.Set;

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

    }

    public static boolean zeroSumSubArray(int[] arr){

        Set<Integer> set = new HashSet();
        int sum = 0;
        set.add(0);

        for (int i = 0; i<arr.length;i++){
            sum =+ arr[i];
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }

        return false;
    }
}
