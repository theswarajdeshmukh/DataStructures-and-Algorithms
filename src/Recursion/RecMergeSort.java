package Recursion;

public class RecMergeSort {

    static class DArray {
        private long[] theArray;
        private int nElems;

        DArray(int maxsize){
        theArray = new long[maxsize];
        nElems = 0;
        }

        public void insert(long value){
            theArray[nElems] = value;
            nElems++;
        }

        public void display(){
            for (int i = 0; i < nElems; i++) {
                System.out.print(theArray[i] + " ");
                System.out.print("");
            }
        }

        public void mergesort(){   // called by main() provides workspace
            long[] workspace = new long[nElems];
            recMergeSort(workspace, 0 , nElems - 1);
        }

        public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            if (lowerBound == upperBound)
                return;
            else
                recMergeSort(workspace, lowerBound, mid ); //sort low half
                recMergeSort(workspace, mid + 1, upperBound); //sort high half
                merge(workspace, lowerBound, mid + 1, upperBound); //merge them
        }

        public void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
                int j = 0;
                int lowerBound = lowPtr;
                int mid = highPtr - 1;
                int n = upperBound - lowerBound+1;

                while (lowPtr <= mid && highPtr <= upperBound)
                    if (theArray[lowPtr] < theArray[highPtr])
                        workspace[j++] = theArray[lowPtr++];
                    else
                        workspace[j++] = theArray[highPtr++];

                while (lowPtr <= mid )
                    workspace[j++] = theArray[lowPtr++];

                while (highPtr <= upperBound)
                    workspace[j++] = theArray[highPtr++];

                for (j = 0; j<n ; j++)
                    theArray[lowerBound + j] = workspace[j];
        }//end merge


    }

    public static void main(String[] args) {

        int maxSize = 100;
        DArray arr;
        arr = new DArray(maxSize); // create the array
        arr.insert(64); // insert items
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);
        arr.display(); // display items
        arr.mergesort(); // merge sort the array
        arr.display(); // display items again

    }
}
