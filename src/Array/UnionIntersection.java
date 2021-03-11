package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Find Union and Intersection of two unsorted arrays
 *Given two unsorted arrays that represent two sets (elements in every array are distinct), find union and intersection of two arrays.
 * For example, if the input arrays are:
 * arr1[] = {7, 1, 5, 2, 3, 6}
 * arr2[] = {3, 8, 6, 20, 7}
 * Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. Note that the elements of union and intersection can be printed in any order.
 */

public class UnionIntersection {

    static void printUnion(int[] a, int[] b) {
        int alength = a.length;
        int blength = b.length;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < alength; i++) {
            map.put(a[i],i);
        }

        for (int j = 0; j < blength; j++) {
            map.put(b[j],j);
        }
        System.out.println("The Union Set of both the arrays : ");
        for (Map.Entry mapElement: map.entrySet()) {
            System.out.print(mapElement.getKey() + " ");
            // map will contain only distinct
            // elements from array a and b
        }
    }

    static void intersection(int[] a, int[] b) {
        int alength = a.length;
        int blength = b.length;

        System.out.print("Intersection is :");

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < alength && j < blength) {

            if (a[i] > b[j]) {
                j++;
            } else if (b[j] > a[i]) {
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };

        printUnion(a,b);
        intersection(a,b);
    }
}
