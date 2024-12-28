/*Given an array arr[] of N elements. The task is to check if the array is PalinArray or not i.e., if all elements of array are palindrome or not. 

Examples: 


Input: arr[] = {121, 131, 20} 
Output: Array is not a PalinArray 
For the given array, element 20 is not a palindrome. Thus the array is not a PalinArray.


Input: arr[] = {111, 121, 222, 333, 444} 
Output: Array is a PalinArray 
For the given array, all the elements of the array are palindromes. Thus the array is a PalinArray. */

import java.util.*;

class isPalinArray1{

    public static boolean isPalindrome(int n) {
        String str = "" + n;
        int len = str.length();
        for(int i = 0; i < len/2 ; ++i){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalinArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; ++i){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {111, 121, 222, 333, 444};
        boolean res = isPalinArray(arr);
        if (res == true)
            System.out.println("Array is a PalinArray");
        else
            System.out.println("Array is not a PalinArray");
    }
}