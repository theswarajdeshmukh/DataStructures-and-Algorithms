package LeetCode;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };


        if (!isValidSudoku(board)){
            System.out.println("Not solvable");
        }
        System.out.println("solvable");

    }
    public static boolean isValidSudoku(int[][] board){

        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int current_val = board[i][j];
                if (current_val != 0 ){
                    if (!seen.add(current_val + "found in row" + i) ||
                            !seen.add(current_val + "found in column" + j) ||
                            !seen.add(current_val + "found in box" + i/3 + "-" + j/3))
                        return false;
                }
            }
        }

        return true;
    }
}
