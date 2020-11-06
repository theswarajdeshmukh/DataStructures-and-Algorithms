package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,55,66,43,33,56,67,122};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth element: ");
        int k = sc.nextInt();
        Kthsmallest(arr, n, k);
    }

    private static void Kthsmallest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        System.out.println("Kth smallest element is: " + arr[k-1]);
    }
}
