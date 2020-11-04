package Recursion;

public class knapsack {

    public static void main(String[] args) {

        int[] arr = {11 , 8, 7, 6, 5};
        int n = arr.length;
        int value = 20;
        knapSack(arr, n , value);

    }

    private static void knapSack(int[] arr, int n, int value) {
        if (value == 0)
            return;
        int[] data = new int[n];
        knapSackUtil(arr, data, 0, n-1, 0, value, n);
    }

    private static void knapSackUtil(int[] arr, int[] data, int start, int end, int index, int value, int n) {
        int sum = 0;
        if (sum == value)
            for (int i =0; i< n  ; i++){
                System.out.print(data[i] + " ");
                System.out.println("");
                return;
            }

        for (int j = start; j <= end ; j++) {
            if (arr[j] <= value && sum <= value) {
                data[index] = arr[j];
                sum = sum + data[index];
            }
            knapSackUtil(arr, data, j+1, end, index+1 , value, n);
        }


    }
}
