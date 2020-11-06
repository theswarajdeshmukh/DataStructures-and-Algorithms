package Recursion;

public class ReverseArrayRecurssion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 ,6};
        int n = arr.length;
        reverseRec(arr, 0, n-1);
        printArray(arr, n);
    }

    private static void printArray(int[] arr, int n) {
        System.out.print("Reveresed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseRec(int[] arr, int start, int end) {
        int temp;

        if (start >= end) return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseRec(arr, start+1, end-1);
    }
}
