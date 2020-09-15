package LeetCode;

import java.util.Scanner;


//       Write a program that outputs the string representation of numbers from 1 to n.
//
//        But for multiples of three it should output “Fizz” instead of the number and for the multiples of
//        five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.


public class FizzBizz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n ; i++) {
            String output = "";

            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";

            if (output == "") output = ""+ i;

            System.out.println(output);

        }



    }
}
