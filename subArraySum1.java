/*Given a 1-based indexing array arr[] of integers and an integer sum. You mainly need to return the left and right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1. */

import java.util.*;

class subArraySum1 {
    
    public static ArrayList<Integer> subArraySum(int[] arr, long sum){
        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = false;
        int n = arr.length;
        for(int i = 0; i < n; ++i){
            int currentsum = arr[i];
            if(currentsum == sum){
                res.add(i+1);
                res.add(i+1);
                flag = true;
                break;
            }
            else{
                for(int j = i+1; j < n; ++j){
                    currentsum += arr[j];
                    if(currentsum == sum){
                        res.add(i+1);
                        res.add(j+1);
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            return res;
        }
        else{
            res.add(-1);
            return res;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        long sum = 23;
        ArrayList<Integer> result
            = subArraySum(arr, sum);
        for (int i : result)
            System.out.print(i + " ");
    }
}
