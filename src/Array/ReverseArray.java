package Array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5};
        int n = arr.length;
        reverse(arr,0,n-1);
        printarray(arr,n);
    }

    private static void printarray(int[] arr, int n) {

        System.out.print("Reveresed array is : ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " " );
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        int temp;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
