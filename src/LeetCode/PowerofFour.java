package LeetCode;

public class PowerofFour {

    //Given an integer(signed 32 bits) write a function to check whether it is a power of 4

    public static void main(String[] args) {

        int num = 16;
       System.out.println( isPowerofFour(num));

    }
    public static boolean isPowerofFour(int num){
        return Math.log(num) / Math.log(4) % 1 == 0;
    }

    public static boolean isPowerofFourNaive(int num){
        if(num == 0) return false;

        while (num != 1){
            if (num % 4 != 0 ) return false;
            num = num / 4;
        }
        return true;
    }
}
