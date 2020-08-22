package Array;

import java.util.HashMap;

public class SingleNumber {

    public SingleNumber() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 5, 4, 5, 3, 4};
        System.out.println(find(arr, arr.length));
        System.out.println(find2(arr, arr.length));
    }

    static int find(int[] arr, int size) {
        int res = arr[0];

        for(int i = 1; i < size; ++i) {
            res ^= arr[i];
        }

        return res;
    }

    static int find2(int[] arr, int size) {
        long sum1 = 0L;
        long sum2 = 0L;
        HashMap<Integer, Integer> m = new HashMap();

        for(int i = 0; i < arr.length; ++i) {
            if (!m.containsKey(arr[i])) {
                sum1 += (long)arr[i];
                m.put(arr[i], 1);
            }

            sum2 += (long)arr[i];
        }

        return (int)(2L * sum1 - sum2);
    }
}
