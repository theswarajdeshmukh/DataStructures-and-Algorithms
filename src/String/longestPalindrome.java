package String;

import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String str){
        int[] occurences = new int[128];
        for (char i:
             str.toCharArray()) {
            int letter = (int) i;
            occurences[letter]++;
        }
        int length = 0;
        for (int occ:
             occurences) {
            length += occ % 2 == 0 ? occ : occ - 1;
        }

        if (length < str.length()) length++;
        
    return length;
    }
}
