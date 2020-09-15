package String;

import java.util.Scanner;

public class longestPalindromesubstring {

    static int resultStart;
    static int resultLength;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(longestPalindrome(str));


    }


    public static String longestPalindrome(String str){



        int strLength = str.length();
        if (strLength < 2){
            return str;
        }
        for (int start = 0; start < strLength - 1; start++){
            expandRange(str, start, start);
            expandRange(str, start, start + 1);
        }
        return str.substring(resultStart, resultStart + resultLength );
    }

    private static void expandRange(String s, int begin, int end ) {

        while (begin >= 0 && end < s.length() &&
               s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1){
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }

    }
}
