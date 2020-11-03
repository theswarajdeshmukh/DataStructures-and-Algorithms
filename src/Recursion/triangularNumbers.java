package Recursion;

import java.io.IOException;
import java.util.Scanner;

public class triangularNumbers {

    static int theNumber;

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle " + theAnswer);
    }

    private static int triangle(int n) {
        if (n == 1){
            return 1;
        }
        else
            return n + triangle(n - 1);
    }

    private static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
}

//   Incidentally, if you’re skeptical of the results returned from triangle(), you can
//        check them by using the following formula:
//        nth triangular number = (n2+n)/2
