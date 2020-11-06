package Array;

public class minAndmax {

    public static void main(String[] args) {

        int[] arr = {100, 1000, 55 ,33, 328 , 382};
        int n = arr.length;
        Pair minmax = getMinMax(arr, n);
        System.out.println("Maximum value is " + minmax.max);
        System.out.println("Manimum value is " + minmax.min);
    }

   static class Pair {
        int max;
        int min;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;

        if (n == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];
        }

        if (arr[0] > arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for (int j = 2; j < n ; j++) {
            if (arr[j] > minmax.max){
                minmax.max = arr[j];
            }else if (arr[j] < minmax.min){
                minmax.min = arr[j];
            }
        }
        return minmax;
    }
}

