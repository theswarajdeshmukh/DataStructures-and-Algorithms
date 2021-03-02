package Sorting;

public class BubbleSort {


    // to print array elements
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        BubbleSort sort = new BubbleSort();
        int[] myArray = {40, 20, 50, 60, 30, 10};
        sort.bubbleSort(myArray);
        sort.printArray(myArray);
    }
}
