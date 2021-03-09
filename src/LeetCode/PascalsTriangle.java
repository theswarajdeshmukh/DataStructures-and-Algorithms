package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 Given an integer numRows, return the first numRows of Pascal's triangle.

 Pascal’s triangle is a triangular array of the binomial coefficients. Write a function that takes an integer value n as input and prints first n lines of the Pascal’s triangle. Following are the first 6 rows of Pascal’s Triangle.
 Input : N = 5
 Output:
 1
 1   1
 1   2   1
 1   3   3   1
 1   4   6   4   1
 1   5   10   10   5   1

 Input: numRows = 5
 Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

 **/


public class PascalsTriangle {

    public static List<List<Integer>> generatePascalsTriangle(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            row.add(1);
            triangle.add(row);
        }


        return triangle;
    }

    public static void main(String[] args) {

    int n = 5;
        System.out.println(generatePascalsTriangle(5));

    }
}
