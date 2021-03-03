package Sorting;

public class InsertionSort {

    public void insertionSort(int arr[]) {
       int n = arr.length;

        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }


    // to print array elements
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int myArray[] = {9, 6, 7, 3, 2};
        sort.insertionSort(myArray);
        printArray(myArray);
    }
}
