/*You are given an integer array heights where heights[i] represents the height of the 
ith bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.*/

import java.util.*;

class mostWater2{

    public static int maxArea(int[] heights) {
        int r = heights.length - 1;
        int res = 0;
        int l = 0;
        while(l < r){
            res = Math.max(res, Math.min(heights[l], heights[r]) *(r-l));
            if(heights[l] <= heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] heights = {1,7,2,5,4,7,3,6};
        int res = maxArea(heights);
        System.out.println(res); 
    }
}
 