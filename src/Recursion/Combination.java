package Recursion;

public class Combination {

    public static void main(String[] args) {

        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        int r = 3;
        int n = arr.length;
        printCombination(arr, r, n);
    }

    private static void printCombination(char[] arr, int r, int n) {

        char data[] = new char[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
         /** arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed **/
    }

    private static void combinationUtil(char[] arr, char[] data, int start, int end, int index, int r) {

        if (index == r){
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
                System.out.println("");
                return;
        }

        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end-i+1 >= r-index ; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }

    }
}
