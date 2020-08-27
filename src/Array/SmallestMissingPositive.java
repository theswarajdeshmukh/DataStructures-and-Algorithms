package Array;

import java.util.Arrays;

public class SmallestMissingPositive {

    public static void main(String[] args) {

        int[] arr = {4,0,1,2};
        //output = 3
      smallestmissingpositive(arr);

    }

    private static void smallestmissingpositive(int[] arr) {
        int missnumber = -1;
        Arrays.sort(arr);
        for (int i =0; i<arr.length ; i++){
           if (arr[i] != i){
               missnumber = i;
           }
        }

        System.out.println(missnumber);
    }
}
