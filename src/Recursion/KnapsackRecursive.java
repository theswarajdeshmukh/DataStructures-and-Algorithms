package Recursion;

public class KnapsackRecursive {

    public static void main(String[] args) {

        int[] wt = new int[] {10, 20, 30};
        int[] val = new int[] { 60, 100, 120 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(wt,val,W,n));
    }

    private static int knapSack(int[] wt, int[] val, int w, int n) {
        if (w==0 || n==0)
            return 0;

        if (wt[n-1] > w)
            return knapSack(wt,val,w,n-1);
        else
            return Math.max(val[n-1] + knapSack(wt,val,w - wt[n-1],n-1), knapSack(wt,val,w,n-1) );

    }
}
/**
//Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words,
// given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
// Also given an integer W which represents knapsack capacity,
// find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
// You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
 **/