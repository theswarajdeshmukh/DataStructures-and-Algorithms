package Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int [] arrayA = {23, 47, 81, 95};
        int [] arrayB = {7, 14, 39, 55, 62, 74};
        int [] arrayC = new int[10];

        merge(arrayA, 4 , arrayB , 6 , arrayC);
        display(arrayC,10);

    }

    //merge A and B into C
    private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {

        int aDex = 0, bDex = 0, cDex = 0;
        //neither array empty
        while (aDex < sizeA && bDex < sizeB)
            if (arrayA[aDex] < arrayB[bDex])
                arrayC[cDex++] = arrayA[aDex++];
            else
                arrayC[cDex++] = arrayB[bDex++];

        while (aDex < sizeA) //while array B is empty but array A isn't
            arrayC[cDex++] = arrayA[aDex++];

        while (bDex < sizeB) //while array A is empty but array B isn't
            arrayC[cDex++] = arrayB[bDex++];
    } //endMerge

    private static void display(int[] array, int size){

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            System.out.print("");
        }
    }
}
