package Array;

public class PoisonousPlant {

    public static void main(String[] args) {

        int arr[] = {3,6,2,7,5};

        System.out.println(""+ PoisonResult(arr));

    }

    static int PoisonResult(int arr[]){
        int count = 0;
        int nElems = arr.length;
        for (int i = 0; i<arr.length-1; i++){

            if (i < i+1){

                for (int j = i +1; j<nElems-1; j++){
                    arr[j] = arr[j+1];
                }
                count ++;
            }


        }
        return count;

    }

}
