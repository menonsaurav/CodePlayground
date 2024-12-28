/*You are given an integer array heights where heights[i] represents the height of the 
ith bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.*/

import java.util.*;

class mostWater1{

    public static int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        for(int i=0; i<n; ++i){
            for(int j = i+1; j<n; ++j){
                    res = Math.max(res, Math.min(heights[i], heights[j]) *(j-i));
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
 