package LeetCode;

import java.util.Scanner;

public class TappingWater {
    public static void main(String[] args) {
        int[] a = {3,1,2,4,0,1,3,2};
        int[] b = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(b));
    }
    public static int trap(int[] height){
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int water = 0;

        while(left<right){
            if(leftMax<rightMax){     //if leftbar is smaller than rightbar
                left++;
                if(leftMax<height[left]){ // change leftmax
                    leftMax = height[left];
                }else{
                    water += leftMax - height[left];
                }
            }else{  //if rightbar is smaller than leftbar
                right--;
                if(rightMax<height[right]){
                    rightMax = height[right];
                }else{
                    water += rightMax - height[right];
                }

            }
        }
        return water;
    }
}


