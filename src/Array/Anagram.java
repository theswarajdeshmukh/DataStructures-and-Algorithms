package Array;

public class Anagram {

    public static void main(String[] args) {



        String a = "ssaabbgg";
        String b = "ggbbaass";
        boolean isAnagram = true ;
        int[] s = new int[256];
        int[] w = new int[256];

        for (char i : a.toCharArray())
        {
            int index = (int) i;
            s[index]++;
        }

        for (char i : b.toCharArray())
        {
            int index = (int) i;
            w[index]++;
        }

        for (int i=0; i<256;i++){

            if(s[i] != w[i] ) {
                isAnagram = false;
                break;
            }else isAnagram = true;

        }

        if (isAnagram==true)
            System.out.printf("Anagram is");
        else System.out.printf("Anagram not");



    }


}
