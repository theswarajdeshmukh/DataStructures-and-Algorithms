//Problem Statement:
//Given an array of distinct integers and a target, you have to return the list of all unique combinations where the chosen numbers sum to target. You may return the combinations in any order.
//The same number may be chosen from the given array an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
//It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
//        Example 1:
//
//        Input: array = [2,3,6,7], target = 7
//
//        Output: [[2,2,3],[7]]
//
//        Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//        7 is a candidate, and 7 = 7.
//        These are the only two combinations.
//
//
//        Example 2:
//
//        Input: array = [2], target = 1
//
//        Output: []
//
//        Explaination: No combination is possible.

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args){
        int [] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ls = combinationSum(arr,target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }

    private static void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if (ind == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1); //pop last element
        }

        findCombination(ind+1,arr,target,ans,ds);
    }

}
