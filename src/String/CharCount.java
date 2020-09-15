package String;

public class CharCount {
    public static void main(String[] args) {
        String str = "aassdbghjdd" ;
        Count(str);

    }

    public static void Count(String str){
        int[] occurences = new int[128];
        for (char i:
             str.toCharArray()) {
            int letter = (int) i;
            occurences[letter]++;
        }
        for (int i = 0; i<128 ; i++){
            if(occurences[i] > 0){
                char occ = (char) i;
                 System.out.println(""+ occ + "-" + occurences[i] );
            }
        }

    }
}
