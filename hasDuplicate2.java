/*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false. */

import java.util.*;

class hasDuplicate2{

    public static boolean hasDuplicate(int[] nums){
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < n; ++i){
            if(seen.contains(nums[i])){
                return true;
            }
            else{
                seen.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,3};
        boolean res = hasDuplicate(nums);
        System.out.println(res); 
    }
}
