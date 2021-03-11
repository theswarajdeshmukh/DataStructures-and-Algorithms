package LeetCode;

/**  167. Two Sum II - Input array is sorted
 Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 *Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */


public class TwoSum2 {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;
        printarray(TwoSum(numbers,target));

    }

    private static void printarray(int[] numbers) {
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static int[] TwoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length-1;

        while (a_pointer <= b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];

            if (sum < target) {
                a_pointer++;
            } else if (sum > target){
                b_pointer--;
            } else {
                return new int[] {a_pointer+1 , b_pointer+1};
            }
        }
        return new int[] {a_pointer+1, b_pointer+1};
    }
}
