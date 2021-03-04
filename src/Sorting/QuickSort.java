package Sorting;

public class QuickSort {


    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index + 1, high);
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

        QuickSort sort = new QuickSort();
        sort.quickSort(arr,0,n-1);

        printArray(arr);
    }
}
