/*Given a string str, the task is to find the longest substring which is a palindrome. If there are multiple answers, then return the first appearing substring.*/

import java.util.*;

class longPal{

    public static boolean checkPal(String s, int low, int high) {
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static String longestPalindrome(String s){
        int n = s.length();
        int start = 0;
        int maxLen = 1;
        for(int i = 0; i<n; ++i){
            for(int j=i; j<n; ++j){
                if(checkPal(s,i,j) && (j-i+1)>maxLen){
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args){
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }
}
