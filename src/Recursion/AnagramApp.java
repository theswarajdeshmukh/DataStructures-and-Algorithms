package Recursion;

import java.util.Scanner;

public class AnagramApp {

    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        count = 0;
        arrChar = input.toCharArray();
        size = input.length();
        doAnagram(size);
    }

    private static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int j = 0; j < newSize; j++) {
            doAnagram(newSize - 1);
            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }
    }

    private static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position]; // save first letter
        for(j=position+1; j<size; j++) // shift others left
            arrChar[j-1] = arrChar[j];
        arrChar[j-1] = temp;
    }

    private static void displayWord() {
        if(count < 99)
            System.out.print(" ");
        if(count < 9)
            System.out.print(" ");
        System.out.print(++count +" ");
        for(int j=0; j<size; j++)
            System.out.print( arrChar[j] );
        System.out.print(" ");
        if(count%6 == 0)
            System.out.println("");
    }
}
