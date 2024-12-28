/*Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in 
O(n) time without using the division operation? */

import java.util.*;

class productExceptSelf1{

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int zeroCount = 0;
        int prod = 1;
        for(int i = 0; i<n ;++i){
            if(nums[i] != 0){
                prod *= nums[i];
            }
            else{
                zeroCount ++;
            }
        }

        if(zeroCount > 1){
            return new int[n];
        }

        int[] final_res = new int[n];
        for(int j = 0; j<n ;++j){
            if(zeroCount > 0){
                final_res[j] = (nums[j] == 0)? prod : 0;
            }
            else{
                final_res[j] = prod / nums[j];
            }
        }
        return final_res;
    }

    public static void main(String[] args){
        int[] nums = {1,2,4,6};
        int[] res = productExceptSelf(nums);
        System.out.println("The result is:" + Arrays.toString(res)); 
    }
}
