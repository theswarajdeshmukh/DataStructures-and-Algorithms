package Puzzles;

public class NextGreaterNumber {
//    Given a positive integer num, create a function that returns the next greater integer that we can make with its digits (the one that comes just after num).
//    If such a number doesn't exist, return num itself.
//
//    Can you do it in O(n) time comlplexity and O(n) space complexity?
//
//    Example 1:
//    Input: num = 3401
//    Output: 3410
//    Example 3:
//    Input: num = 12345
//    Output: 12354
//    Example 4:
//    Input: num = 12354
//    Output: 12435
//    Example 5:
//    Input: num = 4310
//    Output: 4310
//    Example 6:
//    Input: num = 11111
//    Output: 11111

    public static void main(String[] args) {

        int num = 12354;

       System.out.println(nextGreater(num));
    }
    static int nextGreater(int num){
        //we create array named digits to store digits of num
        char[] digits = String.valueOf(num).toCharArray();

        int i = digits.length - 2;
        //we search for the element that breaks the ascending order

        while (i>=0 && digits[i] >= digits[i+1])
            i--;
        //if we find i as -1 then the greater number doesnt exixts
        if (i == -1) return num;

        int j = digits.length - 1;

        //Now we search for the first digit that is greater than i
        while (digits[j] <= digits[i]) j--;

        //we swap the digits at j and digits at i
        char temp = digits[j];
        digits[j] = digits[i];
        digits[i] = temp;

        //we reverse the part starts from i+1
        int left = i+1, right = digits.length - 1;

        while (left<right){
         temp = digits[left];
         digits[left] = digits[right];
         digits[right] = temp;
         left ++;
         right --;
        }

        return Integer.parseInt(String.valueOf(digits));
    }
}
