package Recursion;

public class Power {

    public static void main(String[] args) {

        int base = 2;
        int exp = 4;

        System.out.println("Power is: " + power(base,exp));
    }

    private static int power(int base, int exp) {
        if (exp != 0){
            return base * power(base, exp - 1);
        }
        else
            return 1;
    }
}
