/*Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first. */

import java.util.Arrays;

class twoSum1 {
    
    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<n; ++j){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args){
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] result = twoSum(nums, target);
        System.out.println("Output:" + Arrays.toString(result));
    }
}
