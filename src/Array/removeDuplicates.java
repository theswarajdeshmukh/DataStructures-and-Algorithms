package Array;

public class removeDuplicates {

    public static void main(String[] args){
            int[] array = new int[]{1,1,2};
        removeDuplicatesFun(array);
    }

    private static int removeDuplicatesFun(int[] nums){
        int k = 0;


        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[k]){
                nums[k+1] = nums[i];
                k++;
            }
        }
        System.out.println(k+1);
        return k+1;

    }
}
