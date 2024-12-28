/*Given an array of integers nums, find the subarray with the largest sum and return the sum.

A subarray is a contiguous non-empty sequence of elements within an array.*/

import java.util.*;

class maxSubArray{

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        for(int i=0; i<n; ++i){
            int sum = 0;
            for(int j = i; j<n ; ++j){
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {2,-3,4,-2,2,1,-1,4};
        int res = maxSubArray(nums);
        System.out.println(res); 
    }
}
