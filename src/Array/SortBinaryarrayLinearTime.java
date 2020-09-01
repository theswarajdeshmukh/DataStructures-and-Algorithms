package Array;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Arrays;

public class SortBinaryarrayLinearTime {

    // Given a binary array sort it in linear time and constatnt space . Output should print contain all zeroes followed by ones

    public static void main(String[] args) {

    int[] arr = {1,0,1,0,1,0,0,1};
    SortBinaryarrayLinearTime(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SortBinaryarrayLinearTime(int[] arr){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
            count++;
        }

        //put 0's in the begining
        int k = 0;
        while (count-- != 0){
            arr[k++] = 0;
        }

        // put 1's in remaining places
        while (k < arr.length) {
            arr[k++] = 1;
        }
    }
}
