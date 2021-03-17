package String;


/** Check if a string is a rotated palindrome or not

 * Given a String, check if it is a rotated palindrome or not.
 *
 * For example :
 * CBAABCD is a rotated palindrome as it is a rotation of palindrome ABCDCBA
 * BAABCC is a rotated palindrome as it is a rotation of palindrome ABCCBA
 */

public class IsStringRotatedPalindrome {


    public static void main(String[] args) {

        String str = "ABCDCBA";

        // rotating it by 2 units
        str = str.substring(2) + str.substring(0, 2);

        if (isRotatedPalindrome(str)) {
            System.out.println("The String is Rotated Palindrome");
        } else {
            System.out.println("The String is not a Rotated Palindrome");
        }
    }

    private static boolean isRotatedPalindrome(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // in-place rotate the string by 1 unit
            str = str.substring(1) + str.charAt(0);

            // return true if the rotation is a palindrome
            if (isPalindrome(str, 0, n - 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String str, int low, int high) {
        return (low >= high) || (str.charAt(low) == str.charAt(high) && isPalindrome(str, low + 1, high - 1));
    }
}



