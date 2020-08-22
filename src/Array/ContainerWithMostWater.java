package Array;


public class ContainerWithMostWater {

    public static void main(String[] args) {

        //Input = [1,8,6,2,5,4,8,3,7]
        // Output = 49

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

      System.out.println(conatinerwithmostwater(arr));
       System.out.println(containerwithmostwater2(arr));
    }


    //TimeComplexity = O(n)
    static int containerwithmostwater2(int[] arr){
        int MaxArea = 0;
        int Min = 0;
        int Max = arr.length - 1;

        while (Min < Max){
            int water = Math.min(arr[Min],arr[Max]) * (Max - Min);
            MaxArea = Math.max(MaxArea,water);

            if (arr[Min]<arr[Max]) Min++;
            else Max--;

        }


        return MaxArea;
    }



    //O(n) = n^2;
    static int conatinerwithmostwater(int[] arr) {

        int water = 0;
        int MaxWater = 0;


        for (int i =0; i<arr.length;i++){
            for (int j=arr.length-1; j>i;j--){

                water = Math.min(arr[i],arr[j]) * (j-i);

                MaxWater = Math.max(MaxWater,water);

            }
        }


        return MaxWater;
    }

}
