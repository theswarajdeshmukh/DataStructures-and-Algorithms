package Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 Example 1:

 Input: nums = [1,2,3,1]
 Output: true
 Example 2:

 Input: nums = [1,2,3,4]
 Output: false

 */

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums));
    }
}
