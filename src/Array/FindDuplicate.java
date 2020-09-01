package Array;

import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        if (!FindDuplicate(arr)){
            System.out.println("Duplicate doesnt exists");
        }else
            System.out.println("Duplicate exists");
    }

    static boolean FindDuplicate(int[] arr){

        HashMap hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsValue(arr[i])){
                System.out.println(arr[i]);
                return true;
            }
            hashMap.put(i,arr[i]);
        }

        return false;
    }
}
