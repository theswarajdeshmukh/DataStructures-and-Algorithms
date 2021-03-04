package Sorting;

public class CountingSort {

    public void countingSort(int[] myArray, int high) {
        int counter[] = new int[high+1];

        for (int i: myArray) {
            counter[i]++;
        }

        int startpoint = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                myArray[startpoint++] = i;
                counter[i]--;
            }
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

        int arr[] = {5, 7 ,6, 9, 4, 8, 1, 2, 3};
        int n = arr.length;

        CountingSort sort = new CountingSort();
        sort.countingSort(arr,9);
        printArray(arr);
    }
}
