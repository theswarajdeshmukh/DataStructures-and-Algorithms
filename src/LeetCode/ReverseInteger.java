package LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {

        int integer = 54321;
        System.out.println(reverse(integer));


    }
    static long reverse(int input) {
        long reversed = 0; //long to handle integer outofbound possibility

        while (input != 0){
            reversed = reversed * 10 + input % 10;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return reversed;
    }
}
