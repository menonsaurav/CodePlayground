/*Given an integer array nums, find a subarray that has the largest product within the array and return it.

A subarray is a contiguous non-empty sequence of elements within an array.

You can assume the output will fit into a 32-bit integer.*/

import java.util.*;

class maxProductSubArray{

    public static int maxProductSubArray(int[] nums) {
        int n = nums.length;
        int maxP = nums[0];
        for(int i=0; i<n; ++i){
            int prod = nums[i];
            maxP = Math.max(maxP, prod);
            for(int j = i+1; j<n ; ++j){
                prod *= nums[j];
                maxP = Math.max(maxP, prod);
            }
        }
        return maxP;
    }

    public static void main(String[] args){
        int[] nums = {1,2,-3,4};
        int res = maxProductSubArray(nums);
        System.out.println(res); 
    }
}
